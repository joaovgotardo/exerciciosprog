//Primeira tarefa testar 200 mouses, anotando estado deles. O programa deve receber
//um número indeterminado de entradas, contendo identificação do mouse, podendo ser:
//Necessita de esfera, limpeza, troca de cabo/conector, quebrado

//Identificação = 0 encerra. O programa deve emitir o relatório:
//1 - necessita da esfera		
//2 - de limpeza
//3 - troca do cabo ou conector
//4 - quebrado

#include <stdio.h>

int main(){
    int qtd_esf = 0, qtd_lp = 0, qtd_tcc = 0, qtd_qb = 0, iden;
    float pqesf, pqlp, pqtcc, pqqb, quantidade = 0.0;
    
    printf("Digite o identificador: ");
    scanf("%d", &iden);

    while (iden != 0){
        if (iden == 1){
            qtd_esf += 1;
        }if (iden == 2){
            qtd_lp += 1;
        }if (iden == 3){
            qtd_tcc += 1;
        }if (iden == 4){
            qtd_qb += 1;
        };
        quantidade += 1;
        printf("1 - necessita da esfera\n2 - de limpeza\n3 - troca do cabo ou conector\n4 - quebrado\n");
        printf("Digite o identificador: ");
        scanf("%d", &iden);        
    }
    pqesf = qtd_esf/quantidade*100;
    pqlp  = qtd_lp/quantidade*100;
    pqtcc  = qtd_tcc/quantidade*100;
    pqqb  = qtd_qb/quantidade*100;
    printf("|   Situacao    |   Quantidade  |   Percentual    |\n");
    printf("------------------------------------------------------");
    printf("|      1        |       %d      |      %.1f%%      |\n", qtd_esf, pqesf);
    printf("|      2        |       %d      |      %.1f%%      |\n", qtd_lp, pqlp);
    printf("|      3        |       %d      |      %.1f%%      |\n", qtd_tcc, pqtcc);
    printf("|      4        |       %d      |      %.1f%%      |", qtd_qb, pqqb);
    printf("------------------------------------------------------");
}