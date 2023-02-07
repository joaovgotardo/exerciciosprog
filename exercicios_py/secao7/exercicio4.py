#Construa um algoritmo que leia 10 valores inteiros e positivos e:
#a) Encontre o maior 
#b) Encontre o menor
#c) Calcule a média dos números lidos

manum = -999
minum = 999
soma = 0
for i in range(0, 10):
    n  = int(input("Digite um número: "))
    if n > manum:
        manum = n
    elif n < minum:
        minum = n
    soma = soma + n

print("O maior número foi: {}\nO menor número foi: {}\nA média dos números foi de: {}".format(manum, minum, soma/10))

