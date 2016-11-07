package me.omnisnash.ffcotoiof.logger;

import java.util.ArrayList;
import java.util.List;

public class Logger
{
    private static Logger ourInstance = new Logger();
    private static List<ILoggerListener> listeners;

    private Logger()
    {
        listeners = new ArrayList<>();
    }

    public static Logger getInstance()
    {
        return ourInstance;
    }

    public void log(String log)
    {
        listeners.forEach(listener -> listener.onLog(log));
    }

    public void addLogListener(ILoggerListener listener)
    {
        listeners.add(listener);
    }

    public void removeLogListener(ILoggerListener listener)
    {
        listeners.remove(listener);
    }

    public interface ILoggerListener
    {
        void onLog(String log);
    }
}
