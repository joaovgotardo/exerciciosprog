//Programa q receba um código numerico inteiro e vetor de cinco posições de reais. 
//Se for zero, terminar programa. Se o código for 1, mostre o vetor na ordem direta.
//Se o código for 2, mostre o vetor na ordem inversa.

#include <stdio.h>
int main(){
    int codigo;
    float lista[5];

    for(int i=0; i<5; i++){
        printf("Digite um valor para o vetor: ");
        scanf("%f", &lista[i]);
    }

    printf("Digite um codigo: 0/terminar; 1/mostrar vetor; 2/mostrar vetor inverso: ");
    scanf("%d", &codigo);
    printf("%d", codigo);

    if (codigo == 0){
        printf("Programa encerrado");

    }else if (codigo == 1){
        printf("Vetor em ordem direta: \n");
        for(int i=0; i<5; i++){
            printf("%2.f\n", lista[i]);
        }
    }else if (codigo == 2){
        printf("Vetor em ordem inversa: \n");
        for(int i=4; i>=0; i--){
            printf("%2.f\n", lista[i]);
        }
    }else{
        printf("Codigo nao reconhecido");
        printf("Digite um codigo: 0/terminar; 1/mostrar vetor; 2/mostrar vetor inverso");
        scanf("%d", codigo);
    }
}