//Faça programa q carregue vetor com 10 numeros inteiros, mostrar na ordem inversa 
//q foi digitado.

#include <stdio.h>
int main(){
    int vetor[10]; 

    for(int i=0; i<10; i++){
        printf("De um valor para o vetor: ");
        scanf("%d", &vetor[i]);
    }for(int i=9; i>=0; i--){ //-- ira para tras num loop
        printf("%d\n", vetor[i]);
    }    
}
