#Leia 4 número, calcule o quadrado de cada um, 
# se o valor do terceiro for >= 1000, imprima e 
# finalize, se não, imprima os valores e 
# respectivos quadrados.

a = int(input("Digite um número: "))
b = int(input("Digite um número: "))
c = int(input("Digite um número: "))
d = int(input("Digite um número: "))

if c > 1000:
    print(c, "é maior que 1000")
else:
    print("N --> Quadrado")
    print(a, "-->", a**2)
    print(b, "-->", b**2)
    print(c, "-->", c**2)
    print(d, "-->", d**2)
