"""
Faça um programa que leia 5 números e informe o maior número.
"""
manum = -999
for a in range(1,6):
    a = int(input("Digite um número: "))
    if a > manum:
        manum = a
print("Maior número do loop: ", manum)
