//Elabore um algoritmo que leia um número, se positivo, armazene-o em a,
//se negativo, em b. No final, mostrar o resultado.

package secao6;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        int n, a, b;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = t.nextInt();

        if (n > 0){
            a = n;
            System.out.printf("%d é um numero positivo", a);
        }else if (n < 0){
            b = n;
            System.out.printf("%d é um numero negativo", b);
        }else{
            System.out.print(n + "é um numero neutro");            
        }
        t.close();
    }
}
