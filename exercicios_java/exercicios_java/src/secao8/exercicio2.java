/*Escreva algoritmo q leia dois vetores de 10 posições e faça a soma dos elementos com mesmo índice, 
colocando resultado em outro vetor e mostre.
 */

package secao8;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];
        Scanner t = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.print("Digite um valor para o primeiro vetor: ");
            vetor1[i] = t.nextInt();
            System.out.print("Digite um valor para o segundo vetor: ");
            vetor2[i] = t.nextInt();
            vetor3[i] = vetor1[i] + vetor2[i];
        }for (int i = 0; i< 10; i++){
            System.out.print(vetor3[i]);
        }
        t.close();
    }
}
