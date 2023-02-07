#Escreva algoritmo q leia e mostre um vetor de 20 elementos inteiros e mostre a soma dos elementos.

vetor = []
soma = 0

for i in range (0, 20):
    i = int(input("Digite um valor para o vetor: "))
    soma += i
    vetor.append(i)

print(soma)