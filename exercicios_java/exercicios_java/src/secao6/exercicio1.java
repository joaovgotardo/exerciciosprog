////Ler variável numérica n e imprimi-la se a mesma for maior que 100,
//se não, imprimir com valor zero.

package secao6;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        int n;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = t.nextInt();

        if (n > 100){
            System.out.print("Variável: " + n);
        }else{
            n = 0;
            System.out.print("Variável: " + n);
        }
        t.close();      
    }
}
