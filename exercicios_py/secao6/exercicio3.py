#Ler um número e verificar, se par ou ímpar. 
# Se par, armazena em p, se ímpar em i.

n = int(input('Digite um número: '))
if n%2 == 0:
    p = n
    print("{} é par, n = p".format(n))
else:
    i = n
    print("{} é ímpar, n = i".format(n))