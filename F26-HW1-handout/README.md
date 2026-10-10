Part A:
The singleton design pattern cannot be fully implemented in Python because the language doesn't have any access modifiers. This means the interpreter can't enforce a private constructor. A user could create a second Configuration object with object.__new__(Configuration). And _instance is just private by convention, but can be bypassed as well.
# ECS160_hw1
