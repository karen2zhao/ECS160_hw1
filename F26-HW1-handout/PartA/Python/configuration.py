class Configuration:
    # naming convention: internal, don't use from outside
    # similar to private static but not enforced
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)

            cls._instance.appName = "ECS160-HW1"
            cls._instance.logLevel = "INFO"
            cls._instance.maxConnections = 32
            cls._instance.debugMode = True
        
        return cls._instance

    @classmethod
    def get_instance(cls):
        return cls()