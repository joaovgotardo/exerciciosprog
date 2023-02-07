//Faça um algoritmo que peça dois números e imprima a soma.

package secao3;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        int n1, n2, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;

        System.out.println("A soma entre " + n1 + " e " + n2 + " é: " + soma);

        teclado.close();

    }
}
