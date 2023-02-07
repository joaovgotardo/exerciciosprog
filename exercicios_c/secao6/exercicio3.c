//Ler um número e verificar, se par ou ímpar. Se par, armazena em p,
//se ímpar em i.

#include<stdio.h>

int main(void){
    int n, i, p;

    printf("Digite o numero");
    scanf("%d", &n);

    if (n%2 == 0){
        p = n;
        printf("O valor %d eh par", p);
    }else if (n%2 != 0){
        i = n;
        printf("O valor %d eh impar", i);
    }else{
        printf("Valor nao eh par nem impar");
    };

}