package pl.edu.agh.kis.files;

import java.io.*;

/**
 * Returns the whole file contents as a string.
 */
public class FullFileReader {
    public final String contents;
    public FullFileReader(String path) {
        try {
            this.contents = readEntireFile(new BufferedReader(new FileReader(path)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public FullFileReader(BufferedReader file) {
        this.contents = readEntireFile(file);
    }
    private String readEntireFile(BufferedReader file) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = file.readLine()) != null)
                stringBuilder.append(line).append('\n');

            return stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
