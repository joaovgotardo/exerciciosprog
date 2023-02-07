#O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para
#0,3 as indústrias do 1º grupo são intimadas a suspender atividade, se for maior
#que 0,4, do 1º e 2º grupo, se for 0,5, todos os grupos devem paralisar atividades.

i = float(input("Digite o índice de poluição: "))
if 0.25 > i > 0.05:
    print("Índice aceitável")
elif 0.4 >= i > 0.25:
    print("Empresas do 1º grupo devem suspender atividades")
elif 0.5 >= i > 0.4:
    print("Empresas do 1º e 2º grupos devem suspender atividades")
elif 0.5 < i:
    print("Todas as empresas devem suspender atividades")
else:
    print("Índice inválido")