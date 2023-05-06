package pl.edu.agh.kis;

import pl.edu.agh.kis.Parser.BashGrammarBaseListener;
import pl.edu.agh.kis.Parser.BashGrammarParser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BashToPowershell extends BashGrammarBaseListener {
    public String outputPath;
    public StringBuilder outputString = new StringBuilder("");

    BashToPowershell(String path) {
        this.outputPath = path;
    }

    @Override
    public void enterProgram(BashGrammarParser.ProgramContext ctx) {
        outputString.append(ctx.COMMENT().toString()); //COMMENT
        // !TODO: Instrucion*
        for (int childID = 1; childID < ctx.getChildCount() - 1; childID++) //Instruction*
        {
            enterInstruction((BashGrammarParser.InstructionContext) ctx.getChild(childID));
        }
        exitProgram(ctx);
    }

    @Override
    public void exitProgram(BashGrammarParser.ProgramContext ctx) {
        try {
            File outputFile = new File(this.outputPath);
            outputFile.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String out = String.valueOf(this.outputString);
            System.out.println(out);
            writer.write(out);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Something is wrong with the file: " + e.toString());
        }

    }

    @Override
    public void enterInstruction(BashGrammarParser.InstructionContext ctx) {
        //iteujemy po produkcjach i porównujemy z nullem - jeśli nie jest nullem to to jest ta produkcja - nie znalazłem lepszego sposobu
        if (ctx.pipeline_list() != null) {
            enterPipeline_list(ctx.pipeline_list());
        } else if (ctx.for_loop() != null) {

        }//i tak dalej....


    }

    @Override
    public void enterPipeline_list(BashGrammarParser.Pipeline_listContext ctx) {
        //!TODO: A lot more
        enterPipeline(ctx.pipeline(0));
    }

    @Override
    public void enterPipeline(BashGrammarParser.PipelineContext ctx) {
        //!TODO: a lot more
        for (int i = 0; i < ctx.getChildCount(); i++) {
            enterWord(ctx.word(i));
            if (i<ctx.getChildCount()-1) outputString.append(" ");

        }

    }

    @Override
    public void enterWord(BashGrammarParser.WordContext ctx) {
        //!TODO: a lot more commands
        if (ctx.getText().equals("echo")) outputString.append("Write-Host");
        else outputString.append(ctx.getText());

    }
}
