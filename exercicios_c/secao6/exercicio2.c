//Elabore um algoritmo que leia um número, se positivo, armazene-o em a,
//se negativo, em b. No final, mostrar o resultado.

#include<stdio.h>

int main(void){
    int n, a, b;

    printf("Digite um numero: ");
    scanf("%d", &n);

    if (n>0){
        a = n;
        printf("O resultado é %d, numero positivo", a);
    }else if (n<0){
        b = n;
        printf("%d, numero negativo", b);
    }else{
        printf("Valor neutro");
    };
}