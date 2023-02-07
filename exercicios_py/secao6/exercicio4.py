#Tendo como entrada a altura e sexo, 
# construa um algoritmo que calcule seu peso
# ideal. Homens: (72.7*altura)-58; Mulheres 
# (62.1*altura) - 44.7

alt = float(input("Digite sua altura: "))
sx = str(input("Digite seu sexo (m/f): "))
if sx == "f":
    print("Seu peso ideal é de {}kg".format((62.1*alt) - 44.7))
elif sx == "m":
    print("Seu peso ideal é de {}kg".format((72.7*alt) - 58))
else:
    print("Sexo inválido")
