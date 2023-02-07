#Faça um algoritmo para "Calcular o estoque médio de uma peça, 
# sendo que:" estoque medio = (quantidade mínima + quantidade máxima)/2

qminima = float(input("Digite a quantidade mínima de peças: "))
qmaxima = float(input("Digite a quantidade máxima de peças: "))
print("O estoque médio é %.f"%((qminima+qmaxima)/2))