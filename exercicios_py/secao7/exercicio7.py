"""
Testar 200 mouses, anotando estado deles. O programa deve receber
um número indeterminado de entradas, contendo identificação do mouse, podendo ser:
Necessita de esfera, limpeza, troca de cabo/conector, quebrado

Identificação = 0 encerra. O programa deve emitir o relatório:
1 - necessita da esfera		
2 - de limpeza
3 - troca do cabo ou conector
4 - quebrado
"""
qt_esf = 0
qt_lp = 0
qt_tcc = 0
qt_qb = 0
quant = 0
iden = -1

while iden != 0:
    if iden == 1:
        qt_esf += 1
    elif iden == 2:
        qt_lp += 1
    elif iden == 3:
        qt_tcc += 1
    elif iden == 4:
        qt_qb += 1
    quant += 1
    print("\n0 - terminar programa\n1 - necessita da esfera \n2 - de limpeza\n3 - troca do cabo ou conector\n4 - quebrado")
    iden = int(input("Digite o idenfitifcador: "))


print("Tipo | Mouses | Porcentagem |")
print("1    |   {}    |   {:.1f}%   |".format(qt_esf, (qt_esf/quant*100)))
print("2    |   {}    |   {:.1f}%   |".format(qt_lp, (qt_lp/quant*100)))
print("3    |   {}    |   {:.1f}%   |".format(qt_tcc, (qt_tcc/quant*100)))
print("4    |   {}    |   {:.1f}%   |".format(qt_qb, (qt_qb/quant*100)))
