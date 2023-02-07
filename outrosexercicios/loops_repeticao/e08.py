"""
Faça um programa que leia 5 números e informe a soma e a média dos números.
"""
soma = 0
for a in range(1, 6):
    a = int(input("Digite um número: "))
    soma += a
print("Soma dos números: ", soma)
print("Média dos números: ", soma/5)
