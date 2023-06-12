package pl.edu.agh.kis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.lang3.exception.ExceptionUtils;
import pl.edu.agh.kis.files.FileOperation;
import pl.edu.agh.kis.files.InputOutputFileManager;
import pl.edu.agh.kis.gui.App;
import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.parser.BashGrammarLexer;
import pl.edu.agh.kis.parser.BashGrammarParser;
import pl.edu.agh.kis.settings.ProgramArgumentsParser;
import pl.edu.agh.kis.settings.ProgramConfig;

public class Main {
    public static App gui;
    public static ProgramConfig config;
    public static FileOperation run = (x) -> {
        try {
            //  Lexer
            CharStream textToParse = CharStreams.fromString(x);
            BashGrammarLexer lexer = new BashGrammarLexer(textToParse);

            //  Parser
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

        Main.config = ProgramConfig.getInstance();

        //  If the program determinist to use gui, then run gui.
        if (config.gui()) {
            Main.gui = new App();
            Main.gui.run();
        } else {
            InputOutputFileManager manager = new InputOutputFileManager(Main.config.getInputFiles(), Main.config.getOutputDirectory(), Main.run);
            manager.process();
        }

        //  Print all the messages gathered through the program.
        if (!Main.config.noWarnings())
            System.out.println(Logger.getInstance().getAllLogs());
    }
}
