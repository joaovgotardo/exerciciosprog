//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
//igual ao nome do usuário, mostrando um erro e voltando a pedir informações.

#include <stdio.h>

int main(){
    char usernum, passw;

    printf("Digite o nome de usuario:");
    scanf("%c", &usernum);
    printf("\nDigite a senha:");
    scanf("%c", &passw);      

    while (usernum == passw){
        printf("Erro! Senha e usuario iguais");
        printf("Digite o nome de usuario:");
        scanf("%c", &usernum);
        printf("Digite a senha:");
        scanf("%c", &passw);        
    }

}
