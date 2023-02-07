//Algoritmo que determine o maior entre N números. A condição de parada
//deve ser a entrada de um 0, o algoritmo calculará até que entrada = 0.

#include <stdio.h>

int main(){
    int numero, manum = 0;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    while(numero != 0){
        if (numero > manum){
            manum = numero;
        }
        printf("Informe um numero: ");
        scanf("%d", &numero);
    }
    printf("O maior numero eh %d", manum);
}