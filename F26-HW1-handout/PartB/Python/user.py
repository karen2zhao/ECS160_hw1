import functools

def log(func):
    @functools.wraps(func)
    def wrapper(self, *args):
        arg_text = ", ".join(f'"{a}"' for a in args)
        print(f"[LOG] {func.__qualname__}({arg_text})")
        return func(self, *args)
    return wrapper

class User():
    def get_name(self):
        pass

    def get_email(self):
        pass

    def set_email(self, email):
        pass


class AdminUser(User):
    def __init__(self, name, email):
        self._name = name
        self._email = email

    @log
    def get_name(self):
        return self._name

    @log
    def get_email(self):
        return self._email

    @log
    def set_email(self, email):
        self._email = email
