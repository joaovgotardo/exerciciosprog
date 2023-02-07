#Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
#igual ao nome do usuário, mostrando um erro e voltando a pedir informações.

uname = str(input("Digite seu nome de usuário: "))
passw = str(input("Digite sua senha: "))

while uname == passw:
    print ("Erro!")
    uname = str(input("Digite seu nome de usuário: "))
    passw = str(input("Digite sua senha: "))
    
