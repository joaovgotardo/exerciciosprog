#Algoritmo que pergunte quando você ganha por hora, horas trabalhadas,
#calcule e mostre o total do seu salário no referido mês.

ht = int(input("Digite quantas horas você trabalhou: "))
gh = int(input("Digite quantos reais você ganha por hora: "))
print("Seu salário nesse mês foi de %.2f reais"%(ht*gh))