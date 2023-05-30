package pl.edu.agh.kis.settings;

public class ProgramConfig {
    private static ProgramConfig INSTANCE;
    private static ProgramArgumentsParser parser;
    public final boolean skipComments;
    private ProgramConfig(ParserFlags flags) {
        this.skipComments = flags.skipComments;
    }

    public static ProgramConfig getInstance() {
        if(ProgramConfig.INSTANCE == null) {
            ProgramConfig.INSTANCE = new ProgramConfig(parser.getFlags());
        }

        return ProgramConfig.INSTANCE;
    }

    public static void setParser(ProgramArgumentsParser p) {
        ProgramConfig.parser = p;
    }

}
