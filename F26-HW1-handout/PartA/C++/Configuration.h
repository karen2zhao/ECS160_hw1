#ifndef CONFIGURATION_H
#define CONFIGURATION_H

#include <string>

class Configuration {
public:
    // create and store a static config obj
    static Configuration& getInstance() {
        static Configuration config;
        return config;
    }

    // delete copy constructor
    Configuration(const Configuration& other) = delete;

    // delete copy assignment operator
    Configuration& operator=(const Configuration& other) = delete;

private:
    Configuration() {}      // priv constructor

    std::string appName = "ECS160-HW1";
    std::string logLevel = "INFO";
    int maxConnections = 32;
    bool debugMode = true;
};

#endif
