import os
import struct
import sys
import math

# Оголошення функції запису результату в txt файл
def wResultTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

# Оголошення функції читання результату з txt файлу
def rResultTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

#  Оголошення функції запису результату в bin файл
def wResultBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

# Оголошення функції читання результату з bin файлу
def rResultBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

# Функція обчислення заданого виразу згідно варіанту 9: y=tg(x)/3x
def calculate(x):
    try:
        res = math.tan(math.radians(x))/3*x
    except ValueError as e:
        print(e)
    except ZeroDivisionError as e:
        print(e)

    return res
# Основна програма
if __name__ == "__main__":
    x = float(input("Введіть x:"))
    result = calculate(x)
    print(f"Програмний результат: {result}")
    try:
        wResultTxt("textResult.txt", result)
        wResultBin("binResult.bin", result)
        print("Бінарний результат: {0}".format(rResultBin("binResult.bin")))
        print("Результат текстового файлу: {0}".format(rResultTxt("textResult.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)

