"""
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
"""
tab = int(input("Digite o número para saber sua tabuada: "))
while 0 >= tab or tab > 10:
    tab = int(input("Digite o número para saber sua tabuada: "))
print ("Tabuada do", tab)
for i in range (1, 11):
    print ("%d X %d = %d"%(tab, i, tab*i))
