package pl.edu.agh.kis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.edu.agh.kis.Parser.BashGrammarLexer;
import pl.edu.agh.kis.Parser.BashGrammarParser;

//! NOTE: when /target/generated-sources/antlr4 files are updated, move them to pl.edu.agh.kis.Parser
public class Main {
    public static void main(String[] args) {
        String inputString = "#!/bin/bash\necho 1\n";
        String outputPath = "Haha_Maven/target/generated-sources/out.ps1";


        CharStream textToParse = CharStreams.fromString(inputString);
        //lexer
        //na później: BashGrammarLexer lexer = new BashGrammarLexer(Charstreams.fromFileName(args[0]));
        BashGrammarLexer lexer = new BashGrammarLexer(textToParse);

        //parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BashGrammarParser parser = new BashGrammarParser(tokens);
        ParseTree tree = parser.program();
        BashToPowershell translator = new BashToPowershell(outputPath);
        translator.enterProgram((BashGrammarParser.ProgramContext) tree);

//        ParseTreeWalker walker = new ParseTreeWalker();
//        UppercaseMethodListener listener= new UppercaseMethodListener();
    }
}
