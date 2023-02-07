#Algoritmo que le idades de um nadador, categorias
#infantil-a = 5 a 7
#infantil-b = 8 a 11
#juvenil-a = 12 a 13
#juvenil-b = 14 a 17
#adulto = 18

idade = int(input("Digite sua idade: "))

if 7>= idade >= 5:
    print("Infantil-A")
elif 11>= idade >= 8:
    print("Infantil-B")
elif 13>= idade >= 12:
    print("Juvenil-A")
elif 17>= idade >= 14:
    print("Juvenil-B")
elif idade >= 18:
    print("Adulto")
else:
    print("Idade muito baixa")