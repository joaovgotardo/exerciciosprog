/*
Primeira tarefa testar 200 mouses, anotando estado deles. O programa deve receber
um número indeterminado de entradas, contendo identificação do mouse, podendo ser:
Necessita de esfera, limpeza, troca de cabo/conector, quebrado

Identificação = 0 encerra. O programa deve emitir o relatório:
1 - necessita da esfera		
2 - de limpeza\n3 - troca do cabo ou conector\n4 - quebrado

quantidade = 0
qtd_esf = 0
qtd_limp = 0
qtd_tcc = 0
qtd_qb = 0
*/
package secao7;
import java.util.Scanner;

public class exercicio7{
    public static void main(String[] args){
        int ident = -1, quant = -1, qesf = 0, qlimp = 0, qtcc = 0, qqb = 0;
        Scanner t = new Scanner(System.in);

        while(ident != 0){
            System.out.print("0 encerra\n1 - necessita da esfera\n2 - de limpeza\n3 - troca do cabo ou conector\n4 - quebrado\n");
            System.out.print("Digite o identificador: ");
            ident = t.nextInt();
            quant += 1;
            if(ident == 1){
                qesf += 1;
            }else if(ident == 2){
                qlimp += 1;
            }else if(ident == 3){
                qtcc += 1;
            }else if(ident == 4){
                qqb += 1;
            }
        }float i1, i2, i3, i4;
        i1 = ((float)qesf / (float)quant * (float)100.00);
        i2 = ((float)qlimp / (float)quant * (float)100.00);
        i3 = ((float)qtcc / (float)quant * (float)100.00);
        i4 = ((float)qqb / (float)quant * (float)100.00);

        System.out.print("Quantidade: " + quant);
        System.out.print("\nId | Mouses | Pct |");
        System.out.printf("\n1 | %d | %.2f |", qesf, i1);
        System.out.printf("\n2 | %d | %.2f |", qlimp, i2);
        System.out.printf("\n3 | %d | %.2f |", qtcc, i3);
        System.out.printf("\n4 | %d | %.2f |", qqb, i4);

        t.close();
    }
}