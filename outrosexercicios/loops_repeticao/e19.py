"""
Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores.
Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

"""
a = int(input("Digite quantos números terá o loop: "))
soma = 0
manu = -999
minu = 999
for i in range (1, a+1):
    n = int(input("Digite um número: "))
    while n > 1000:
        if n > manu:
            manu = n
        if minu > n:
            minu = n
        soma += n   
        #n = int(input("Digite um número: "))
print ("O maior número foi %d, o menor foi %d, e a soma é %d"%(manu, minu, soma))
