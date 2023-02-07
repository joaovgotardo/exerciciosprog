//Algoritmo que conte de 1 a 100, e a cada múltiplo de 10, emita uma mensagem:
//"Múltiplo de 10"

#include <stdio.h>

int main(){
    int a = 1;

    while (a <= 100){
        printf("%d\n", a);
        a += 1;
        if (a%10 == 0){
            printf("Multiplo de 10: ");
        };
    }
}