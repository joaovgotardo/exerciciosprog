"""
Altere o programa anterior permitindo ao usuário informar as populações e as
taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
"""
def counter():
    a = int(input("Digite a população do pais A: "))
    b = int(input("Digite a população do pais B: "))   

    cont = 0
    while b > a:
        cont += 1
        a += a*0.03
        b += b*0.015
        print ("População no ano %d no Pais A: %.f habitantes"%(cont, a))
        print ("População no ano %d no Pais B: %.f habitantes"%(cont, b))
    print("\nO país A levaria %d anos para ultrapassar ou igualar o pais B em população. "%(cont))

counter()
vd = str(input("Digite S para reiniciar e N para sair: "))
while vd == "S":
    counter()
if vd == "N":
    print("Fim")
