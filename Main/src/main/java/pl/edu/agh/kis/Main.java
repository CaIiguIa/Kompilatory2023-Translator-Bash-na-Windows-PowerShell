package pl.edu.agh.kis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.exception.ExceptionUtils;

import pl.edu.agh.kis.files.FileOperation;
import pl.edu.agh.kis.files.InputOutputFileManager;
import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.parser.BashGrammarLexer;
import pl.edu.agh.kis.parser.BashGrammarParser;
import pl.edu.agh.kis.settings.ProgramArgumentsParser;
import pl.edu.agh.kis.settings.ProgramConfig;

public class Main {
    public static final String inputDirectory = "Main\\src\\test\\input";
    public static final String outputDirectory = "Docs\\Examples\\Output";
    public static FileOperation run = (x) -> {
        try {
            //lexer
            CharStream textToParse = CharStreams.fromString(x);
            BashGrammarLexer lexer = new BashGrammarLexer(textToParse);

            //parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BashGrammarParser parser = new BashGrammarParser(tokens);
            BashGrammarParser.ProgramContext tree = parser.program();
            BashToPowershell translator = new BashToPowershell();
            translator.enterProgram(tree);
            translator.exitProgram(tree);
            return translator.getOutputString();
        } catch (Exception err) {
            String stacktrace = ExceptionUtils.getStackTrace(err);
            Logger.getInstance().addLog(stacktrace);
            return stacktrace;
        }
    };
    public static void main(String[] args) {
        //  Gives ability to use command line arguments.
        ProgramArgumentsParser parser = new ProgramArgumentsParser(args);
        ProgramConfig.setParser(parser);

        InputOutputFileManager manager = new InputOutputFileManager(Main.inputDirectory, Main.outputDirectory, Main.run);
        manager.process();

        //  Print all the messages gathered through the program.
        System.out.println(Logger.getInstance().getAllLogs());
    }
}
