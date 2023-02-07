"""
Altere o programa anterior para mostrar no final a soma dos números.
"""
a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))
soma = 0
for i in range(a+1, b):
    print(i)
    soma += i
print ("\nA soma dos números é: ", soma)
