"""
A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo
"""
n = int(input("Digite o n-ésimo termo para o loop: "))
t = 1
u = 1
for i in range (1, n+1, 2):
    print (t)
    t += u
    print (u)
    u = t+u

