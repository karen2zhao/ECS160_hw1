package edu.ucdavis.ecs160.hw1;

public class Configuration {

    private String appName;
    private String logLevel;
    private int maxConnections;
    private boolean debugMode;
    // eager initialization, thread-safe
    private static final Configuration config = new Configuration();

    // singleton design pattern implementation
    // private constructor
    private Configuration() {
        appName = "ECS160-HW1";
        logLevel = "INFO";
        maxConnections = 32;
        debugMode = true;
    }

    // static getter method
    public static Configuration getInstance() {
        return config;
    }

    // getter methods for rest of variables
    public String getAppName() {
        return appName;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isDebugMode() {
        return debugMode;
    }
}