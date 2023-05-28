package pl.edu.agh.kis.translations;

import org.json.JSONObject;

public class TranslationArgument {
    private static final String flagKey = "Flag";
    private static final String argumentKey = "WindowsPowerShell_Argument";
    public final int flag;
    public final String translated_argument;

    TranslationArgument(JSONObject translationArgumentObj) {
        this.flag = translationArgumentObj.getInt(TranslationArgument.flagKey);
        this.translated_argument = translationArgumentObj.getString(TranslationArgument.argumentKey);
    }
}
