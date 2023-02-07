#Elabore um algoritmo que leia um número, 
# se positivo, armazene-o em a,
# se negativo, em b. 
# No final, mostrar o resultado.

n = int(input("Digite um número: "))
if n > 0:
    a = n
    print("Número positivo, n = a")
elif n < 0:
    b = n
    print('Número negativo, n = b')
else:
    print("Número neutro")