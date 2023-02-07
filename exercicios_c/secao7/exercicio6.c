//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
//inteiro entre 1 e 10. O usuário deve informar de qual número ele quer ver a tabuada.

#include<stdio.h>

int main(){
    int a;
    printf("Digite o numero q voce quer saber a tabuada: ");
    scanf("%d", &a);

    if (1 > a || 10 < a){
        while (1 > a || 10 < a){
            printf("Digite o numero q voce quer saber a tabuada: ");
            scanf("%d", &a);
        }        
    }if (1 < a && 10 > a){
        printf("Tabuada do: %d\n", a);
        for(int i = 1; i <= 10; i++){
            printf("%d X %d = %d\n", a, i, a*i);
        }
    };
}