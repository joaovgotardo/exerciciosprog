#Algoritmo que determine o maior entre N números. A condição de parada
#deve ser a entrada de um 0, o algoritmo calculará até que entrada = 0.

n = int(input("Digite um numero: "))
manum = 0

while n != 0:
    n = int(input("Digite um numero: "))
    if n > manum:
        manum = n
print("O maior número do loop foi", manum)
