package pl.edu.agh.kis.settings;

import pl.edu.agh.kis.Main;
import pl.edu.agh.kis.log.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Queue;

public class ProgramArgumentsParser {
    public static final int skipCommentsFlag       =   0b1;
    public static final int noWarningFlag          =   0b10;
    public static final int customSuffixFlag       =   0b100;
    public static final int separateDirectoryFlag  =   0b1000;
    public static final int customInputFlag        =   0b10000;
    public static final int customOutputFlag       =   0b100000;
    public static final int useGUI                 =   0b1000000;
    public static final int defaultMode            =   0;
    public static final String defaultSuffix       =   "_out";
    public static final String defaultCustomDirectoryName = "";
    public static String defaultOutputDirectory    =   Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    public String customSuffix;
    public String customDirectoryName;
    public final Queue<String> inputFiles;
    public String outputDirectory;
    private int mode;
    public ProgramArgumentsParser(String[] args) {
        this.mode = ProgramArgumentsParser.defaultMode;

        this.customSuffix = ProgramArgumentsParser.defaultSuffix;
        this.customDirectoryName = ProgramArgumentsParser.defaultCustomDirectoryName;
        this.inputFiles = new LinkedList<>();
        this.outputDirectory = ProgramArgumentsParser.defaultOutputDirectory;
        this.parse(args);
    }

    private void parse(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            switch (args[i]) {
                case "--NoComments":
                    this.mode |= ProgramArgumentsParser.skipCommentsFlag;
                    break;
                case "--NoWarnings":
                    this.mode |= ProgramArgumentsParser.noWarningFlag;
                    break;
                case "-g":
                case "-G":
                case "--GUI":
                    this.mode |= ProgramArgumentsParser.useGUI;
                    break;
                case "--CustomSuffix":
                    this.mode |= ProgramArgumentsParser.customSuffixFlag;
                    ++i;
                    this.customSuffix = args[i];
                    break;
                case "--SeparateDirectory":
                    this.mode |= ProgramArgumentsParser.separateDirectoryFlag;
                    ++i;
                    this.customDirectoryName = args[i];
                    break;
                case "-i":
                case "-I":
                case "--Input":
                    this.mode |= ProgramArgumentsParser.customInputFlag;
                    ++i;
                    for (; i < args.length; ++i) {
                        if (args[i].charAt(0) != '-') {
                            try {
                                Files.walk(Path.of(args[i]))
                                        .filter(Files::isRegularFile)
                                        .forEach(path -> this.inputFiles.add(path.toFile().toString()));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } else {
                            --i;
                            break;
                        }
                    }
                    break;
                case "-o":
                case "-O":
                case "--Output":
                    this.mode |= ProgramArgumentsParser.customOutputFlag;
                    ++i;
                    this.outputDirectory = args[i];
                    File file = new File(this.outputDirectory);
                    if (!file.isDirectory()) {
                        Logger.getInstance().addLog("Provided output directory \"" + this.outputDirectory + "\" is not a directory!");
                        this.mode &= (~ProgramArgumentsParser.customOutputFlag);
                    }
                    break;
                default:
                    Logger.getInstance().addLog("Unknown command-line argument provided: \"" + args[i] + "\". Due to this fact this argument will be skipped!");
                    break;
            }
        }

        if (this.inputFiles.isEmpty()) {
            Logger.getInstance().addLog("No input to a program provided!");
        }
    }

    public int getMode() {
        return this.mode;
    }
}