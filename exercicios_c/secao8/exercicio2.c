//Escreva algoritmo q leia dois vetores de 10 posições e faça a soma dos elementos com 
//mesmo índice, colocando resultado em outro vetor e mostre.

#include <stdio.h>

int main(void){
    int vetor1[10], vetor2[10], vetor3[10];

    for(int i=0; i<10; i++){
        printf("Digite um valor para o primeiro vetor: ");
        scanf("%d", &vetor1[i]);
        printf("Digite um valor para o segundo vetor: ");
        scanf("%d", &vetor2[i]);
        vetor3[i] = vetor1[i] + vetor2[i];
    }
    for(int i=1; i<10; i++){
        printf("%d\n", vetor3[i]);
    }
}