import sys

# Заповнення зубчастої матриці згідно варіанту
def generate_matrix(size, filler):
    matrix = []
    for i in range(size, 0, -1):
        row = [filler] * i
        matrix.append(row)
    return matrix

# Вивід зубчастої матриці згідно варіанту
def print_matrix(matrix):
    for row in matrix:
        print(' '.join(row))

# Введення розміру
size = int(input("Введіть розмір квадратної матриці >2: "))

# Перевірка коректності введення
if size < 3:
    print("Розмір повинен бути >2.")
    sys.exit()

# Введення символу-заповнювача
filler = input("Введіть один символ-заповнювач: ")

# Перевірка коректності введення
if len(filler) != 1:
    print("Потрібно ввести лише один символ!")
    sys.exit()
# Виклик функцій згенерування матриці та її виводу
matrix = generate_matrix(size,filler)
print_matrix(matrix)



