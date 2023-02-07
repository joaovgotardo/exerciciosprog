"""
A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,...
Faça um programa que gere a série até que o valor seja maior que 500.
"""
t = 0
u = 0
for i in range (1, 100, 2):
        print (t)
        t += u
        print (u)
        u = t+u
        if u >= 500 or t >= 500:
            break
        else:
            continue

