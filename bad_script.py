import os
import sys

global_var_tracker = 0

def do_something_complex(data):
    # SOLID Violation (SRP & High Complexity): doing parsing, processing, and I/O together
    # Smells: bad naming, missing type hints, no docstrings
    global global_var_tracker
    res = []
    
    # Bug: using undefined variable `x`
    print(x)

    for item in data:
        if type(item) == str:
            if item.startswith("a"):
                for char in item:
                    if char == "b":
                        res.append(char)
                        global_var_tracker += 1
                        
    # Bug: trying to open a file without context manager and not closing it
    f = open("log.txt", "w")
    f.write(str(res))
    
    return res

class DataProcessor:
    def __init__(self):
        self.data = []
        
    def process(self):
        # SOLID Violation: hardcoding dependency
        result = do_something_complex(self.data)
        return result
# Demo error
