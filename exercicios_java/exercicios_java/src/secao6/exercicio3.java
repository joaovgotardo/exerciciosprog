//Ler um número e verificar, se par ou ímpar. Se par, armazena em p,
//se ímpar em i.
package secao6;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        int n, i, p;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = t.nextInt();

        if (n%2 == 0){
            p = n;
            System.out.print(p + " é par");
        }else {
            i = n;
            System.out.print(i + " é ímpar");
        }
        t.close();
    };
}
