//2- Faça um algoritmo para "Calcular o estoque médio de uma peça, sendo que:"
//estoque medio = (quantidade mínima + quantidade máxima)/2

#include <stdio.h>
int main(void){
    int qminima, qmaxima;
    float est_medio;

    printf("Digite a quantidade maxima do produto: ");
    scanf("%d", &qminima);

    printf("Digite a quantidade minima do produto: ");
    scanf("%d", &qmaxima);

    est_medio = (qminima+qmaxima)/2;

    printf("O estoque medio da peca eh %f", est_medio);
}