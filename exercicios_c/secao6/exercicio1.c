//Ler variável numérica n e imprimi-la se a mesma for maior que 100, se não, imprimir 
//com valor zero.

#include<stdio.h>

int main(void){
    int n;

    printf("Digite a variável: ");
    scanf("%d", &n);

    if (n>100){ //uma estrutura de decisão so recebe o ; no final dela
        printf("%d", n);
    }else{
        printf("Zero");
    };
}