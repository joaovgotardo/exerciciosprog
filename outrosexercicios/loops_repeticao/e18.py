"""
Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores.
"""
a = int(input("Digite quantos números terá o loop: "))
soma = 0
manu = -999
minu = 999
for i in range (1, a+1):
    n = int(input("Digite um número: "))
    if n > manu:
        manu = n
    if minu > n:
        minu = n
    soma += n
print ("O maior número foi %d, o menor foi %d, e a soma é %d"%(manu, minu, soma))
