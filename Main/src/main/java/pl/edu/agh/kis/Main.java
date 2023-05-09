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
        System.out.println(1);
        String inputString = "#!/bin/bash\necho 1\n";
        String outputPath = "Main/target/generated-sources/out.ps1";

        CharStream textToParse = CharStreams.fromString(inputString);
        //lexer
        //na później: BashGrammarLexer lexer = new BashGrammarLexer(Charstreams.fromFileName(args[0]));
        BashGrammarLexer lexer = new BashGrammarLexer(textToParse);

        //parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BashGrammarParser parser = new BashGrammarParser(tokens);
        BashGrammarParser.ProgramContext tree = parser.program();
        BashToPowershell translator = new BashToPowershell(outputPath);
        translator.enterProgram(tree);

//        ParseTreeWalker walker = new ParseTreeWalker();
//        UppercaseMethodListener listener= new UppercaseMethodListener();
    }
}
