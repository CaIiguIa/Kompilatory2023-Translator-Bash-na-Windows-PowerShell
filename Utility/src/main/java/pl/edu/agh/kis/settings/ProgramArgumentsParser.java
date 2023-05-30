package pl.edu.agh.kis.settings;

public class ProgramArgumentsParser {
    public final int mode;
    public final String[] commandLineArguments;
    public ProgramArgumentsParser(String[] args) {
        this.mode = 0;
        this.commandLineArguments = args;
        parse();
    }

    private void parse() {
        for (String argument : commandLineArguments) {
            switch (argument) {
                case "--SeparateDirectory":

                    break;
                case "--NoComments":

                    break;
                case "-i":
                case "-I":
                case "--Input":

                    break;
                case "-o":
                case "-O":
                case "--Output":

                    break;
            }
        }
    }

    public ParserFlags getFlags() {
        return new ParserFlags(this.mode);
    }

}
