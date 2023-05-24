package pl.edu.agh.kis;

import java.util.LinkedList;
import java.util.Queue;

public class Logger {
    private static Logger INSTANCE;
    private static String logSeparator = "\n\n";
    private Queue<String> logs;

    private Logger() {
        this.logs = new LinkedList<>();
    }

    public static Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }

        return INSTANCE;
    }
    public void addLog(String log) {
        logs.add(log);
    }
    public String getAllLogs() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String log : logs)
            stringBuilder.append(log).append(logSeparator);
        return stringBuilder.toString();
    }
    public String getLog() {
        return logs.poll();
    }
}
