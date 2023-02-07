//Escreva algoritmo q leia e mostre um vetor de 20 elementos inteiros 
//e mostre a soma dos elementos.

#include<stdio.h>
int main(){
    int a[20], soma = 0;

    for(int i=0; i<20; i++){
        printf("Digite um valor: ");
        scanf("%d", &a[i]);
        soma += a[i];
    }printf("\nA soma dos elementos foi %d", soma);
}