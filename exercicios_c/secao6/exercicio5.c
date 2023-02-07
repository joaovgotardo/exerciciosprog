//Faça um algoritmo que leia p (peso de peixes), verifique se há excesso
//(maior que 50kg), gravar na variável e (excesso), na variável m o valor da multa,
//4 reais vezes peso. Caso contrário, mostrar variáveis como zero.
#include<stdio.h>

int main(){
    float p, e, m;

    printf("Informe o peso de peixes: ");
    scanf("%f", &p);

    e = 0, m = 0;

    if (p>50){
        e = p-50;
        m = e*4;
        printf("O excesso eh de %1.f quilos e a multa eh de R$ %1.f reais", e, m);
    }else{
        printf("O excesso eh %1.f e a multa eh %1.f", e, m);
    }
}