#Escreva algoritmo q leia dois vetores de 10 posições e faça a soma dos elementos com mesmo índice, colocando
#resultado em outro vetor e mostre.

vetor1 = []
vetor2 = []
vetor3 = []
for i in range(0, 10):
    i = int(input("Digite um valor para o primeiro vetor: "))
    vetor1.append(i)
    i = int(input("Digite um valor para o segundo vetor: "))
    vetor2.append(i)
for i in range(0, 10):
    soma = vetor1[i] + vetor2[i]
    vetor3.append(soma)
print(vetor3)