//Elabore um algoritmo que leia c e n, código e número de horas trabalhadas. 
//Calcule o salário sabendo-se que ele ganha RS 10,00 por hora. Quando exceder 50, calcule
//o excesso na variável e. Caso contrário, zerar. A hora excedente vale 20. Imprimir
//salário total e excedente.

#include <stdio.h>
int main(){
    int ht, e = 0, st = (ht-e)*10;

    printf("Digite o numero de horas trabalhadas: ");
    scanf("%d", &ht);
    
    if (ht > 50){
        e = ht - 50;
        st = (ht-e)*10 + (e*20);
        printf("O salario total eh %d reais, e o salario excedente eh %d reais",
        st, e*20);
    }else{
        printf("O salario total eh %d reais, e o salario excedente eh 0 reais",
        st);
    };
}