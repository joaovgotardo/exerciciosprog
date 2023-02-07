//Algoritmo que le idades de um nadador, categorias
//infantil-a = 5 a 7
//infantil-b = 8 a 11
//juvenil-a = 12 a 13
//juvenil-b = 14 a 17

#include <stdio.h>

int main(){
    int idade;

    printf("Diga a idade");
    scanf("%d", &idade);

    if (idade >=5 && idade <= 7){
        printf("Infantil-A");
    }else if (idade >=8 && idade <= 11){
        printf("Infantil-B");
    }else if (idade >=12 && idade <= 13){
        printf("Juvenil-A");
    }else if (idade >=14 && idade <= 17){
        printf("Juvenil-B");
    }else if (idade >=18){
        printf("Adulto");
    }else{
        printf("Idade invalida");
    };
}