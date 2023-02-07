"""
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
informações.
"""
user = input("Digite o nome de usuário: ")
senha = input("Digite a senha: ")
while (user == senha):
    print("Erro, informações iguais")
    user = input("Digite o nome de usuário: ")
    senha = input("Digite a senha: ")    
