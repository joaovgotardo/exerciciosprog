#Faça um algoritmo que leia p (peso de peixes), 
# verifique se há excesso (maior que 50kg), 
# gravar na variável e (excesso), na variável m
# o valor da multa, 4 reais vezes peso. Caso 
# contrário, mostrar variáveis como zero.

p = int(input("Digite o peso dos peixes em kg: "))
if p > 50:
    e = p - 50
    m = e*4.00
    print("A multa é de R${} e o excesso é de {}kg".format(m, e))
else:
    e = 0
    m = 0.00
    print ("A multa é de R${} e o excesso é de {}kg".format(m, e))