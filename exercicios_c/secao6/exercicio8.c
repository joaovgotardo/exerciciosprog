// Leia um número inteiro e mostre se é par ou ímpar, positivo ou negativo.
//numerico: n = numero inteiro

#include <stdio.h>

int main(){
    int n;
    printf("Digite um numero: ");
    scanf("%d", &n);
    printf("Digite um n")
    
    if (n%2 == 0){
        if (n > 0){
            printf("%d eh um numero par positivo", n);
        }else if (n < 0){
            printf("%d eh um numero par negativo", n);
        };
    }else if (n%2 != 0){
        if (n > 0){
            printf("%d eh um numero impar positivo", n);
        }else if (n < 0){
            printf("%d eh um numero impar negativo", n);
        };
    }else{
        printf("0 é um numero neutro");
    };
}