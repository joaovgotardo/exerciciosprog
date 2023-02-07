//Tendo como entrada a altura e sexo, construa um algoritmo que calcule seu peso
//ideal. Homens: (72.7*altura)-58; Mulheres (62.1*altura) - 44.7
#include<stdio.h>
#include<ctype.h> //desativa o case-sensitive do c em uma determinada funcao
 
int main(void){
    float alt, pid;
    char sx;

    printf("Digite sua altura: ");
    scanf("%f", &alt);
    gets(stdin); //permite a entrada de um char apos um float
    printf("Digite seu sexo (m/f): ");
    scanf("%c", &sx);

    if (tolower(sx) == 'f'){
        pid = (62.1*alt) - 44.7;
        printf("Seu peso ideal eh %2.f quilos", pid);
    }else if (tolower(sx) == 'm'){
        pid = (72.7 * alt) - 58;
        printf("Seu peso ideal eh %2.f quilos", pid);
    }else{
        printf("Sexo invalido");
    };
}