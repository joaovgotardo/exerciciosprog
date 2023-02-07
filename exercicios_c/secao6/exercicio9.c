//O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para
//0,3 as indústrias do 1º grupo são intimadas a suspender atividade, se for maior
//que 0,4, do 1º e 2º grupo, se for 0,5, todos os grupos devem paralisar atividades.

#include <stdio.h>

int main(){
    float i;

    printf("Digite o indice de poluicao: ");
    scanf("%f", &i);

    if (i <= 0.25 && i >= 0.05){
        printf("Indice aceitavel");
    }else if (i >= 0.3 && i < 0.4){
        printf("Empresas do primeiro grupo devem paralisar atividades");
    }else if (i >= 0.4 && i < 0.5){
        printf("Empresas do primeiro e segundo grupo devem paralisar atividades");
    }else if (i >= 0.5){
        printf("Todas as empresas devem paralisar atividades");
    }else{
        printf("Algo de errado aconteceu");
    };
}