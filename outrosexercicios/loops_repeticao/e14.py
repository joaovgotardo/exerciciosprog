"""
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
de números pares e a quantidade de números ímpares.
"""
p = []
i = []
for a in range (1, 11):
    a = int(input("Digite um número: "))
    if a%2 == 0:
        p.append(a)
    elif a%2 != 0:
        i.append(a)

print("A quantidade de pares é: ", len(p))
print("A quantidade de ímpares é: ", len(i))
