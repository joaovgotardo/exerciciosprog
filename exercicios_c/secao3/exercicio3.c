//Faça um algoritm oque converta metros para centímetros.

#include <stdio.h>

int main(void){
    int mt, ct;

    printf("Digite a quantidade de metros: ");
    scanf("%d", &mt);

    ct = mt*100;

    printf("%d metros eh igual a %d centimetros", mt, ct);
}