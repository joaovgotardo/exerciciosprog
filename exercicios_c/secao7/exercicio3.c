//- Programa que gera e escreve números ímpares dos números entre 100 e 200.

#include <stdio.h>

int main(){
    int a = 100;

    while (a <= 200){
        if (a%2 != 0){
            printf("%d\n", a);
        };
        a += 1;
    }
}