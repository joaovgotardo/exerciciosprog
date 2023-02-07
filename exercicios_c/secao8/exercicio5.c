//Programa q carregue vetor com dez inteiros, calcule, mostre números maiores q 50 e suas 
//posições, mostrar mensagem se não tiver nenhum.

#include<stdio.h>
#include<stdbool.h>//para usar booleanos
int main(){
    int a[10];
    bool mq50 = false;
    for (int i=1; i<10; i++){
        printf("Digite um numero para o vetor: ");
        scanf("%d", &a[i]);
        if (a[i] > 50){
            printf("Valor maior que 50\n");
            mq50 = true;
        }
    }if (mq50 == false){
        printf("Nenhum valor maior que 50 nesse array");
    }
}