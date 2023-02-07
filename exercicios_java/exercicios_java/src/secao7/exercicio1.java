//Algoritmo que determine o maior entre N números. A condição de parada
//deve ser a entrada de um 0, o algoritmo calculará até que entrada = 0.

package secao7;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        int n, manum = 0;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número. 0 para sair: ");
        n = t.nextInt();

        while (n != 0){
            System.out.print("Digite um número. 0 para sair: ");
            n = t.nextInt();
            if (n > manum){
                manum = n;
            }            
        }
        System.out.print("O maior número desse loop foi: " + manum);
        t.close();
    }
}
