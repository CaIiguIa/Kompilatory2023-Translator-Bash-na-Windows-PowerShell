package pl.edu.agh.kis.settings;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramConfig {
    private static ProgramConfig INSTANCE;
    private static ProgramArgumentsParser parser;

    private ProgramConfig() {
    }

    public static ProgramConfig getInstance() {
        if (ProgramConfig.INSTANCE == null) {
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

    public boolean customInput() {
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

        if (this.customOutput())
            return parser.outputDirectory;

        return ProgramArgumentsParser.defaultOutputDirectory;
    }

    public static void setParser(ProgramArgumentsParser p) {
        if (ProgramConfig.parser == null) {
            ProgramConfig.parser = p;
        }
    }

    public void setInput(Queue<String> q) {
        parser.inputFiles = q;
    }

    public void setOutputDirectory(String d) {
        parser.outputDirectory = d;
    }
    public void setSuffix(String s){
        parser.customSuffix=s;

        int number=parser.getMode();
        int position=2;
        int bit=1;
        int mask = 1 << position;
        parser.setMode((number & ~mask) | ((bit << position) & mask));
    }

    public void setComments(boolean c){
        int number=parser.getMode();
        int position=0;
        int bit=c?1:0;
        int mask = 1 << position;
        parser.setMode((number & ~mask) | ((bit << position) & mask));
    }
}
