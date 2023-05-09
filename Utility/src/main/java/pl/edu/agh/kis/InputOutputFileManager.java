package pl.edu.agh.kis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 */
public class InputOutputFileManager {
    private File InputDirectory;
    private File OutputDirectory;
    private FileOperation fileOperation;
    InputOutputFileManager(String inputDirectoryPath, String outputDirectoryPath, FileOperation fileOperation) {
        this.InputDirectory = new File(inputDirectoryPath);
        this.OutputDirectory = new File(outputDirectoryPath);
        this.fileOperation = fileOperation;

        if (!InputDirectory.isDirectory()) {
            throw new RuntimeException(inputDirectoryPath + " is not a directory!");
        }
        if (!OutputDirectory.isDirectory()) {
            throw new RuntimeException(outputDirectoryPath + " is not a directory!");
        }
    }
    public String getOutputFileName(String in) {
        String substring = ".sh";
        String replacement = "_out.ps1";

        StringBuilder builder = new StringBuilder(in);

        builder.replace(in.length() - substring.length(), in.length(), replacement);

        return builder.toString();
    }
    public void process() {
        File[] inFiles = InputDirectory.listFiles();

        if (inFiles != null) {
            for (File inFile : inFiles) {
                if (inFile.isFile()) {
                    System.out.println("Entered file: " + inFile.getName());
                    File file = new File(this.OutputDirectory.getAbsolutePath() + "\\" + getOutputFileName(inFile.getName()));

                    StringBuilder stringBuilder = new StringBuilder();

                    try (BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
                        String line;

                        while ((line = reader.readLine()) != null) {
                            stringBuilder.append(line).append('\n');
                        }

                        file.createNewFile();
                        FileWriter writer = new FileWriter(file);
                        writer.write(fileOperation.operate(stringBuilder.toString()));
                        writer.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
