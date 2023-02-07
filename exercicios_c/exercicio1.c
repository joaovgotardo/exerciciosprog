//Algoritmo que multiplica um primeiro número pelo segundo.
//1 - Pegue um número.
//2 - Pegue um outro número.
//3 - Some os dois números.
//4 - Multiplique essa soma pelo primeiro número escolhido.

#include <stdio.h> //include é um import de biblioteca do c; 
//std - standard - io - input/output - entrada/saída
#include <stdlib.h>
#include <string.h>

#define SIZE 60

//int indica o retorno da função main, que retorna um inteiro
int main(void){ 
    int num1, num2, soma, multiplicacao;

    printf("Informe o primeiro numero: "); //printf imprime uma informação na tela
    scanf("%d", &num1); //scanf recebe a informação e torna num1 na resposta do usuário
    printf("Informe o segundo numero: "); 
    scanf("%d", &num2);

    soma = num1+num2;
    multiplicacao = soma*num1;

    printf("O resultado eh %d", multiplicacao); //necessário usar o %d

}