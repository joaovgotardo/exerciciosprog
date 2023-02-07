// Algoritm oque pergunte quando você ganha por hora, horas trabalhadas, calcule
// e mostre o total do seu salário no referido mês.

#include <stdio.h>

int main(void){
    int gh, ht, salario;

    printf("Digite o quanto voce ganha por hora: ");
    scanf("%d", &gh);

    printf("Digite quantas horas voce trabalhou: ");
    scanf("%d", &ht);

    salario = gh*ht;

    printf("O seu salario eh de %d reais", salario);
}