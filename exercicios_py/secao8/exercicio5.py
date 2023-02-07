#Programa q carregue vetor com dez inteiros, calcule, mostre números maiores q 50 e suas posições, 
#mostrar mensagem se não tiver nenhum.

vetor = []
m50 = False

for i in range(0, 10):
    i = int(input("Digite um valor para o vetor: "))
    vetor.append(i)
    if i > 50:
        print(i, "pos:", vetor.index(i))
        m50 = True

if m50 == False:
    print("Nenhum valor acima de 50")

