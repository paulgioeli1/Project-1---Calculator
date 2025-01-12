def addemup(num1, num2):
    return num1 + num2

def subtractem(num1, num2):
    return num1 - num2

def multiplyem(num1, num2):
    return num1 * num2

def divideem(num1, num2):
    if num2 == 0:
        return print("Divide by zero error")
    else:
        return num1 / num2

def exponentiate(num1, num2):
    return num1 ** num2

def modulo(num1, num2):
    return num1 % num2

print(addemup(4, 2)) #should be 6
print(subtractem(17, 21)) #should be -4
print(multiplyem(3, -4)) #should be -12
print(divideem(17, 4)) #should be 4.25
print(exponentiate(3, 3)) #should be 27
print(modulo(100, 3)) #should be 1


