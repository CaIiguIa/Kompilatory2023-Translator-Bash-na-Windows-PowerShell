package pl.edu.agh.kis.files;

import org.apache.commons.lang3.exception.ExceptionUtils;
import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.settings.ProgramConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class InputOutputFileManager {
    private final Queue<String> InputDirectory;
    private final File OutputDirectory;
    private final FileOperation fileOperation;
    public InputOutputFileManager(Queue<String> inputFiles, String outputDirectoryPath, FileOperation fileOperation) {
        this.InputDirectory = inputFiles;
        this.OutputDirectory = new File(outputDirectoryPath);
        this.fileOperation = fileOperation;


        if (!OutputDirectory.isDirectory())
            if (!this.OutputDirectory.mkdir())
                throw new RuntimeException(outputDirectoryPath + " is not a directory!");
    }
    public static String getOutputFileName(String in) {
        String substring = ".sh";
        String replacement = ProgramConfig.getInstance().getCustomSuffix() + ".ps1";

        StringBuilder builder = new StringBuilder(in);

        builder.replace(in.length() - substring.length(), in.length(), replacement);

        return builder.toString();
    }
    public void process() {
        for (String filePath : InputDirectory) {
            File inFile = new File(filePath);
            if (!inFile.isFile()) continue;

            Logger.getInstance().addLog("Entered file: " + inFile.getAbsolutePath());
            File file = new File(this.OutputDirectory.getAbsolutePath() + "\\" + getOutputFileName(inFile.getName()));

            try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
                FileWriter writer = new FileWriter(file);
                writer.write(fileOperation.operate(new FullFileReader(reader).contents));
                writer.close();
            } catch (IOException err) {
                String stack = ExceptionUtils.getStackTrace(err);
                Logger.getInstance().addLog(stack);
            }
        }
    }

    /**
     *
     * @param   inputFiles - It is a list / queue of absolute paths to a files that you want to process.
     * @param   fileOperation - operation performed on a given file contents.
     * @return  The processed contents or an error message that was retrieved form input data.
     */
    public static List<String> process(List<String> inputFiles, FileOperation fileOperation) {
        List<String> output = new ArrayList<>();

        for (String filePath : inputFiles) {
            File inFile = new File(filePath);
            if (!inFile.isFile()) continue;

            Logger.getInstance().addLog("Entered file: " + inFile.getAbsolutePath());

            try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
                output.add(fileOperation.operate(new FullFileReader(reader).contents));
            } catch (IOException err) {
                String stack = ExceptionUtils.getStackTrace(err);
                Logger.getInstance().addLog(stack);
                output.add(stack);
            }
        }

        return output;
    }

    /**
     *
     * @param   inputFile - absolute path to a file that you want to process.
     * @param   fileOperation - operation performed on a given file contents.
     * @return  The processed contents or an error message that was retrieved form input data.
     */
    public static String process(String inputFile, FileOperation fileOperation) {
        File inFile = new File(inputFile);
        if (!inFile.isFile()) return "";

        Logger.getInstance().addLog("Entered file: " + inFile.getAbsolutePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            return fileOperation.operate(new FullFileReader(reader).contents);
        } catch (IOException err) {
            String stack = ExceptionUtils.getStackTrace(err);
            Logger.getInstance().addLog(stack);
            return stack;
        }
    }
}
