//Leia 4 números, calcule o quadrado de cada um, se o valor do terceiro for 
//>= 1000, imprima e finalize, se não, imprima os valores e respectivos quadrados.

#include<stdio.h>

int main(){
    int a, b, c, d;

    printf("Digite numero: ");
    scanf("%d", &a);
    printf("Digite numero: ");
    scanf("%d", &b);
    printf("Digite numero: ");
    scanf("%d", &c);
    printf("Digite numero: ");
    scanf("%d", &d);

    if (c>=1000){
        printf("O terceiro valor eh %d", c);
    }else{
        printf("O primeiro valor eh %d, seu quadrado eh %d |", a, a*a);
        printf("O segundo valor eh %d, seu quadrado eh %d |", b, b*b);
        printf("O terceiro valor eh %d, seu quadrado eh %d |", c, c*c);
        printf("O quarto valor eh %d, seu quadrado eh %d |", d, d*d);
    }
}


