package pl.edu.agh.kis.translations;

import org.json.JSONArray;
import org.json.JSONObject;

import pl.edu.agh.kis.files.FullFileReader;
import pl.edu.agh.kis.log.Logger;

import java.util.*;

/**
 *
 * @since 0.3
 */
public class Translator {
    private static Translator INSTANCE;
    private static final String flagKey = "Flags";
    private static final String translationsKey = "Translations";
    private final List<TranslationUnit> translations;
    private final int invalidFindIndex = -1;
    public final String inputFilePath = "Main\\src\\main\\config\\TranslatorConfig.json";

    public String commandDelimiter = " ";
    private Translator() {
        JSONObject jsonObject = new JSONObject(new FullFileReader(inputFilePath).contents);

        JSONArray translationsArray = jsonObject.getJSONArray(Translator.translationsKey);
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
        if (index == this.invalidFindIndex) return command;

        return this.translations.get(index).translation;
    }

    public String translateArgument(String command, String argument) {
        final int index = this.findCommand(command);

        argument = argument.replaceAll(" ", "");

        if (index == this.invalidFindIndex) {
            return argument;
        }
        TranslationUnit unit = this.translations.get(index);
        if (unit.arguments.containsKey(argument)) {
            return unit.arguments.get(argument).translated_argument;
        }
        return "";
    }
    public String translateCommand(String command, List<String> arguments) {
        StringBuilder stringBuilder = new StringBuilder(" ");

        final int index = this.findCommand(command);
        if (index == this.invalidFindIndex) {

            for (String arg : arguments)
                stringBuilder.append(this.commandDelimiter).append(arg);
        } else {
            TranslationUnit unit = this.translations.get(index);

            Queue<String> lastInsert = new LinkedList<>();

            boolean popFlag = false;

            for (String arg : arguments) {
                if (arg.equals("")) continue;
                if (popFlag) {
                    popFlag = false;
                    continue;
                }

                if (unit.arguments.containsKey(arg)) {
                    TranslationArgument argument = unit.arguments.get(arg);

                    switch (argument.flag) {
                        case 0 -> stringBuilder.append(this.commandDelimiter).append(argument.translated_argument);
                        case 1 -> Logger.getInstance().addLog("In command: " + command + ", argument: " + argument.translated_argument + " is not translatable!");
                        case 2 -> {
                            popFlag = true;
                            Logger.getInstance().addLog("In command: " + command + ", argument: " + argument.translated_argument + " is not translatable and the next argument is skipped!");
                        }
                        case 3 -> stringBuilder.insert(0, argument.translated_argument + this.commandDelimiter);
                        case 4 -> lastInsert.add(this.commandDelimiter + argument.translated_argument);
                        default -> Logger.getInstance().addLog("Wrong flag in command translation!");
                    }
                } else {
//                    Logger.getInstance().addLog("In command: " + command + ", argument: " + arg + " is not found!");
                    stringBuilder.append(this.commandDelimiter).append(arg);
                }
            }

            for (String val : lastInsert)
                stringBuilder.append(val);
        }
        //System.out.println(stringBuilder.toString());
        return stringBuilder.substring(1);
    }
    private int findCommand(String command) {
        for (int i = 0; i < this.translations.size(); ++i)
            if (Objects.equals(this.translations.get(i).command, command))
                return i;

        return this.invalidFindIndex;
    }
}
