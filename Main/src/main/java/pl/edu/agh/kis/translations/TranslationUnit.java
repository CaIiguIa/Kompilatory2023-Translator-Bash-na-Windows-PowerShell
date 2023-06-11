package pl.edu.agh.kis.translations;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TranslationUnit {
    private static final String commandKey = "Bash_Command";
    private static final String translationKey = "WindowsPowerShell_Command";
    private static final String descriptionKey = "Description";
    private static final String argumentsKey = "arguments";
    public final String command;
    public final String translation;
    public final  String description;
    public final Map<String, TranslationArgument> arguments;
    public TranslationUnit(JSONObject translationObj) {
        this.command = translationObj.getString(TranslationUnit.commandKey);
        this.translation = translationObj.getString(TranslationUnit.translationKey);
        this.description = translationObj.getString(TranslationUnit.descriptionKey);

        this.arguments = new HashMap<>();
        JSONObject argumentsObj = translationObj.getJSONObject(TranslationUnit.argumentsKey);

        argumentsObj.keys().forEachRemaining(argument -> this.arguments.put(argument, new TranslationArgument(argumentsObj.getJSONObject(argument))));
    }
}
