#Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
#inteiro entre 1 e 10. O usuário deve informar de qual número ele quer ver a tabuada.

tab = int(input("Digite um número para saber a tabuada: "))

while tab > 10 or 0>tab:
    tab = int(input("Digite um número para saber a tabuada: "))

print("Tabuada do: ", tab)
for i in range(1, 11):
    print(tab, "X", i, "=", tab*i)

