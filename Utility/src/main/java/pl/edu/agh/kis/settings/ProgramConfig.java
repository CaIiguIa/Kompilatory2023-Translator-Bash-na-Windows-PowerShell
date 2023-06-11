package pl.edu.agh.kis.settings;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramConfig {
    private static ProgramConfig INSTANCE;
    private static ProgramArgumentsParser parser;
    private ProgramConfig() {}
    public static ProgramConfig getInstance() {
        if(ProgramConfig.INSTANCE == null) {
            ProgramConfig.INSTANCE = new ProgramConfig();
        }

        return ProgramConfig.INSTANCE;
    }

    public boolean skipComments() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.skipCommentsFlag) > 0;
    }

    public boolean noWarnings() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.noWarningFlag) > 0;
    }

    public boolean gui() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.useGUI) > 0;
    }

    public boolean CustomSuffix() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.customSuffixFlag) > 0;
    }

    public String getCustomSuffix() {
        return (parser == null || !this.CustomSuffix() ? ProgramArgumentsParser.defaultSuffix : parser.customSuffix);
    }

    public boolean SeparateDirectory() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.separateDirectoryFlag) > 0;
    }

    public String getSeparateDirectory() {
        return (parser == null ? ProgramArgumentsParser.defaultCustomDirectoryName : parser.customDirectoryName);
    }

    public boolean customInput () {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.customInputFlag) > 0;
    }

    public Queue<String> getInputFiles() {
        return (parser == null ? new LinkedList<>() : parser.inputFiles);
    }

    public boolean customOutput() {
        return ((parser == null ? ProgramArgumentsParser.defaultMode : parser.getMode()) & ProgramArgumentsParser.customOutputFlag) > 0;
    }

    public String getOutputDirectory() {
        if (parser == null)
            return ProgramArgumentsParser.defaultOutputDirectory;
        if (this.customOutput()) {
            if (this.SeparateDirectory()) {
                return parser.outputDirectory + "\\" + this.getSeparateDirectory();
            }
            return parser.outputDirectory;
        }
        return ProgramArgumentsParser.defaultOutputDirectory;
    }

    public static void setParser(ProgramArgumentsParser p) {
        if (ProgramConfig.parser == null) {
            ProgramConfig.parser = p;
        }
    }
}
