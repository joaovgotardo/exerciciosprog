//Leia um número inteiro e mostre se é par ou ímpar, positivo ou negativo.
//numerico: n = numero inteiro
package secao6;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        int n;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o número: ");
        n = t.nextInt();

        if (n%2 == 0){
            if (n > 0){
                System.out.print(n + " é um par positivo");
            }else if (n == 0){
                System.out.print("Número neutro");
            }else{
                System.out.print(n + " é um par negativo");
            }
        }else if (n%2 != 0){
            if (n > 0){
                System.out.print(n + " é um ímpar positivo");
            }else{
                System.out.print(n + " é um ímpar negativo");
            }
        }
        t.close();
    }
}
