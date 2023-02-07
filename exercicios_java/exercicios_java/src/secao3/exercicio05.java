//Faça um algoritm oque converta metros para centímetros.

package secao3;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        int met;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor para converter metros a centímetros");
        met = teclado.nextInt();

        System.out.println(met + " metros é igual a " + met*100 + " centímetros");
        teclado.close();
    }
}
