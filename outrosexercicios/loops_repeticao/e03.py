"""
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
Use a função len(string) para saber o tamanho de um texto (número de caracteres).
"""
nome = str(input("Digite seu nome: "))
idade = int(input("Digite sua idade: "))
salario = float(input("Digite seu salário: "))
sx = input("Digite o sexo: ")
e_c = str(input("Digite o estado civil: "))
estcs = ['s', 'c', 'v', 'd']
while 4 > len(nome):
    nome = str(input("Digite um nome válido: "))
while 0 > idade and idade > 150:
    idade = int(input("Digite uma idade válida: "))
while 0 > salario:
    salario = float(input("Digite um salário válido: "))
while (sx != 'F') or (sx != 'M'):
    sx = str(input("Digite um sexo válido: "))
while e_c not in estcs:
    e_c = str(input("Digite um estado civil válido: "))
