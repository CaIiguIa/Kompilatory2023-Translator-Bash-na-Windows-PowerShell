package pl.edu.agh.kis;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @since 0.3
 */
public class Translator {
    private static Translator INSTANCE;
    private final Map<String, String> translator_dispatcher = new HashMap<>();
    public final String inputFilePath = "Main\\src\\main\\config\\TranslatorConfig.csv.in";

    public final String ErrorFlag;
    public final String SkipNextArgumentFlag;
    private Translator() {
        this.SkipNextArgumentFlag = "";
        this.ErrorFlag = "";
        try (Reader in = new FileReader(inputFilePath)) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records)
                translator_dispatcher.put(record.get(1), record.get(2));
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
    public static Translator getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Translator();
        }

        return INSTANCE;
    }
    public static String translate(String command) {
        String output = getInstance().translator_dispatcher.get(command);
        return output == null ? command : output;
    }

    public static String translateCommand(String command, List<String> arguments) {
        return "";
    }
}
