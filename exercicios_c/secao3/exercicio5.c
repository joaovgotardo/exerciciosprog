//Tendo como entrada a altura da pessoa, construa um algoritmo que calcule seu
//peso ideal, formula: (72.7*altura) - 58

#include <stdio.h>

int main(void){
    float altura, peso_ideal;

    printf("Digite sua altura: ");
    scanf("%f", &altura);

    peso_ideal = (72.7*altura) - 58;

    printf("Seu peso ideal é eh %.1f quilos", peso_ideal);
}