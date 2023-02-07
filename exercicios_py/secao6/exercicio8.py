#Leia um número inteiro e mostre se é par ou ímpar, positivo ou negativo.

n = int(input("Digite um número: "))
if n > 0:
    if n%2 == 0:
        print(n, "é um par positivo")
    else:
        print(n, "é um ímpar positivo")
elif n < 0:
    if n%2 == 0:
        print(n, "é um par negativo")
    else:
        print(n, "é um ímpar negativo")
else:
    print(n, "é um número neutro")
