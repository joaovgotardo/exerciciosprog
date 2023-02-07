#Faça programa q carregue vetor com 10 numeros inteiros, mostrar na ordem inversa q foi digitado.

vetor = []
for i in range (0, 10):
    i = int(input("Digite um valor para o vetor:"))
    vetor.append(i)
print(vetor[9:-1:-1])