package pl.edu.agh.kis.translations;

import org.json.JSONArray;
import org.json.JSONObject;
import pl.edu.agh.kis.files.FullFileReader;
import pl.edu.agh.kis.log.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @since 0.3
 */
public class Translator {
    private static Translator INSTANCE;
    private final String noTranslationKey = "NoTranslation";
    private final String deleteNextArgumentKey = "DeleteNextArgument";
    private final String translationsKey = "Translations";
    private final String delimiter = " ";
    private final List<TranslationUnit> translations;

    public final String inputFilePath = "Main\\src\\main\\config\\TranslatorConfig.json";
    public final String noTranslationFlag;
    public final String skipNextArgumentFlag;
    private Translator() {
        JSONObject jsonObject = new JSONObject(new FullFileReader(inputFilePath).contents);

        this.noTranslationFlag = jsonObject.getString(this.noTranslationKey);
        this.skipNextArgumentFlag = jsonObject.getString(this.deleteNextArgumentKey);

        JSONArray translationsArray = jsonObject.getJSONArray(this.translationsKey);
        this.translations = new ArrayList<>(translationsArray.length());
        for (int i = 0; i < translationsArray.length(); i++)
            translations.add(new TranslationUnit(translationsArray.getJSONObject(i)));
    }
    public static Translator getInstance() {
        if(Translator.INSTANCE == null) {
            Translator.INSTANCE = new Translator();
        }

        return Translator.INSTANCE;
    }
    public String translate(String command) {
        int index = this.findCommand(command);
        if (index == -1) return command;

        return this.translations.get(index).translation;
    }
    public String translateCommand(String command, List<String> arguments) {
        StringBuilder stringBuilder = new StringBuilder();

        int index = this.findCommand(command);
        if (index == -1) {
            stringBuilder.append(command).append(this.delimiter);

            for (String arg : arguments)
                stringBuilder.append(arg).append(this.delimiter);
        } else {
            TranslationUnit unit = this.translations.get(index);

            stringBuilder.append(unit.translation).append(this.delimiter);

            boolean popFlag = false;

            for (String arg : arguments) {
                if (popFlag) {
                    popFlag = false;
                    continue;
                }

                String translatedArgument = unit.arguments.get(arg);

                if (this.noTranslationFlag.equals(translatedArgument)) {
                    Logger.getInstance().addLog("In command: " + command + ", argument: " + arg + " is not translatable!");
                } else if (this.skipNextArgumentFlag.equals(translatedArgument)) {
                    popFlag = true;
                    Logger.getInstance().addLog("In command: " + command + ", argument: " + arg + " is not translatable!");
                } else {
                    stringBuilder.append(arg).append(this.delimiter);
                }
            }
        }
        return stringBuilder.toString();
    }

    private int findCommand(String command) {
        for (int i = 0; i < this.translations.size(); ++i)
            if (Objects.equals(this.translations.get(i).command, command))
                return i;

        return -1;
    }
}
