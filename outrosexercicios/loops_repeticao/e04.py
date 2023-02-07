"""
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes
com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o
número de anos necessários para que a população do país A ultrapasse ou iguale
a população do país B, mantidas as taxas de crescimento.
"""
a = 80000
b = 200000
cont = 0
while b > a:
    cont += 1
    a += a*0.03
    b += b*0.015
    print ("População no ano %d no Pais A: %.f habitantes"%(cont, a))
    print ("População no ano %d no Pais B: %.f habitantes"%(cont, b))
print("\nO país A levaria %d anos para ultrapassar ou igualar o pais B em população. "%(cont))
