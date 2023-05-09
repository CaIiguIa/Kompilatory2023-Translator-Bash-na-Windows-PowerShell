package pl.edu.agh.kis;

import pl.edu.agh.kis.parser.BashGrammarBaseListener;
import pl.edu.agh.kis.parser.BashGrammarParser;

public class BashToPowershell extends BashGrammarBaseListener {
    private StringBuilder outputString = new StringBuilder();

    BashToPowershell() {}

    public String getOutputString() {
        return outputString.toString();
    }

    @Override
    public void enterProgram(BashGrammarParser.ProgramContext ctx) {
        outputString.append(ctx.COMMENT().toString()); //COMMENT
        // !TODO: Instrucion*
        for (int childID = 1; childID < ctx.getChildCount() - 1; childID++) //Instruction*
        {
            enterInstruction((BashGrammarParser.InstructionContext) ctx.getChild(childID));
        }
    }

    @Override
    public void exitProgram(BashGrammarParser.ProgramContext ctx) {}

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
        String output = Translator.getInstance().translate(ctx.getText());
        if (output == null) output = ctx.getText();
        outputString.append(output);
    }
}
