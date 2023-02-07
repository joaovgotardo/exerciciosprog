#Elabore um algoritmo que leia c e n, 
#código e número de horas trabalhadas. 
# Calcule o salário sabendo-se que ele ganha 
# RS 10,00 por hora. Quando exceder 50, 
# calcule o excesso na variável e. 
# Caso contrário, zerar. A hora excedente 
# vale 20. Imprimir salário total e excedente.

c = str(input("Digite seu código: "))
n = int(input("Digite o número de horas trabalhadas: "))
if n > 50:
    e = n - 50
    print("Seu salário total é de R$", (((n-e)*10)+(e*20)))
    print("Seu salário excedente é de R$", (e*20))
else:
    e = 0
    print("Seu salário total é de R$", (n*10))