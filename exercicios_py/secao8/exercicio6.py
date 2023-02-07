#Programa q receba um código numerico inteiro e vetor de cinco posições de reais. 
#Se for zero, terminar programa. Se o código for 1, mostre o vetor na ordem direta.
#Se o código for 2, mostre o vetor na ordem inversa.

vetor = []

for i in range (0, 5):
    n = float(input("Digite um valor para a lista: "))
    vetor.append(n)

codigo = int(input("0 para sair\n1 para ordem direta\n2 para ordem inversa. Digite o código: "))
if codigo == 1:
    print(vetor)
elif codigo == 2:
    vetor.reverse()
    for n in vetor:
        print(n)
elif codigo == 0:
    print("Fim")
else:
    codigo = int(input("0 para sair\n1 para ordem direta\n2 para ordem inversa. Digite o código: "))
  
