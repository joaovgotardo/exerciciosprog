"""
Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles.
"""
a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))
for i in range(a+1, b):
    print(i)
