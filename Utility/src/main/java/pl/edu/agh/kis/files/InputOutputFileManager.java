package pl.edu.agh.kis.files;

import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.settings.ProgramConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
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
    public String getOutputFileName(String in) {
        String substring = ".sh";
        String replacement = ProgramConfig.getInstance().getCustomSuffix() + ".ps1";

        StringBuilder builder = new StringBuilder(in);

        builder.replace(in.length() - substring.length(), in.length(), replacement);

        return builder.toString();
    }
    public void process() {

        for (String filePath : InputDirectory) {
            File inFile = new File(filePath);
            if (inFile.isFile()) {
                Logger.getInstance().addLog("Entered file: " + inFile.getAbsolutePath());
                File file = new File(this.OutputDirectory.getAbsolutePath() + "\\" + getOutputFileName(inFile.getName()));

                try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
                    FileWriter writer = new FileWriter(file);
                    writer.write(fileOperation.operate(new FullFileReader(reader).contents));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
