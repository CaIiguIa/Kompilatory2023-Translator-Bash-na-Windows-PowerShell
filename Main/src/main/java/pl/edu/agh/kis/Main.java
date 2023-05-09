package pl.edu.agh.kis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.edu.agh.kis.parser.BashGrammarLexer;
import pl.edu.agh.kis.parser.BashGrammarParser;

//! NOTE: when /target/generated-sources/antlr4 files are updated, move them to pl.edu.agh.kis.Parser
public class Main {
    public static void main(String[] args) {
        //  Lambda performed on each file in the given directory, returns a string written in each output file in Docs/ExampleOutput
        FileOperation run = (x) -> {
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
               return err.toString();
            }
        };
        InputOutputFileManager manager = new InputOutputFileManager("Main\\src\\test\\input", "Docs\\Examples\\Output", run);
        manager.process();
    }
}
