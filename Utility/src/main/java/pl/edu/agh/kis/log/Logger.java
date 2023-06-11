package pl.edu.agh.kis.log;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;

public class Logger {
    private static Logger INSTANCE;
    private final String logSeparator;
    private final Queue<String> logs;
    private ByteArrayOutputStream outputStream;
    private final PrintStream originalErrStream;

    private Logger() {
        this.originalErrStream = System.err;
        this.logs = new LinkedList<>();
        this.logSeparator = "\n";
        this.outputStream = new ByteArrayOutputStream();

        System.setErr(new PrintStream(outputStream));
    }

    public static Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }

        return INSTANCE;
    }
    public void addLog(String log) {
        logs.add(outputStream.toString());
        outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        logs.add(log);
    }
    public String getAllLogs() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String log : logs)
            stringBuilder.append(log).append(logSeparator);

        System.setErr(originalErrStream);
        INSTANCE = null;
        return stringBuilder.toString();
    }
    public String getLog() {
        return logs.poll();
    }
}
