
# Write a simple interpreter which understands "+", "-", and "*" 
# operations. Apply the operations in order using command/arg 
# pairs starting with the initial value of `value`. 
# If you encounter an unknown command, return -1.

# interpret(1, ['+'], [1]) → 2
# interpret(4, ['-'], [2]) → 2
# interpret(1, ['+', '*'], [1, 3]) → 6

def interpret(value, commands, args):
    if len(commands) != len(args):
        return -1
    
    result = value

    for i in range(len(commands)):
        if commands[i] != "+" and commands[i] != "-" and commands[i] != "*":
           return -1

        if commands[i] == "+":
            result = result + args[i]
        elif commands[i] == "-":
            result = result - args[i]
        elif commands[i] == "*":
            result = result * args[i]
        else:
            return -1

    return result

# print(interpret(1, ['+'], [1]))
# print(interpret(4, ['-'], [2]))
print(interpret(1, ['+', '*'], [1, 3]))