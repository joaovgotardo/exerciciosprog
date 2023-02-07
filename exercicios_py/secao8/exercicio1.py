#Fazer algoritmo q carregue vetor de 5 elementos inteiros e armazene em um vetor só os pares maiores 
#que 0. Mostrar elementos do vetor na tela.

vetor = []
v_par = []
for i in range(0, 5):
    i = int(input("Digite um valor: "))
    vetor.append(i)
    if i%2 == 0 and i>0:
        v_par.append(i)

print(v_par)