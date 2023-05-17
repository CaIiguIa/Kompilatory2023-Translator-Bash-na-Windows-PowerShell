package pl.edu.agh.kis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import pl.edu.agh.kis.parser.BashGrammarLexer;
import pl.edu.agh.kis.parser.BashGrammarParser;

public class Main {
    public static void main(String[] args) {
        InputOutputFileManager manager = new InputOutputFileManager("Main\\src\\test\\input", "Docs\\Examples\\Output", Main.run);
        manager.process();
    }
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
            err.printStackTrace();
            return err.toString();
        }
    };
}
