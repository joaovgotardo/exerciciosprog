//Construa um algoritmo que leia 10 valores inteiros e positivos e:
//a) Encontre o maior 
//b) Encontre o menor
//c) Calcule a média dos números lidos

#include <stdio.h>

int main(){
    int a, nlidos = 1, manum = -999, menum = 999, soma = 1;

    printf("Digite um valor inteiro e positivo");
    scanf("%d", &a);

    while (nlidos <= 10){
        printf("Digite um valor inteiro e positivo");
        scanf("%d", &a);
        if (a > manum){
            manum = a;
        };
        if (menum > a){
            menum = a;
        };
        soma += a;
        nlidos += 1;
    }
    printf("Maior numero: %d\n", manum);
    printf("Menor numero: %d\n", menum);
    printf("Media dos numeros: %d", (soma/10));
}