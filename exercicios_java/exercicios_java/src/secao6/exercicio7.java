//Leia 4 número, calcule o quadrado de cada um, se o valor do terceiro for 
//>= 1000, imprima e finalize, se não, imprima os valores e respectivos quadrados.


package secao6;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        int a, b, c, d;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        a = t.nextInt();
        System.out.print("Digite o segundo número: ");
        b = t.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = t.nextInt();
        System.out.print("Digite o quarto número: ");
        d = t.nextInt();

        if (c > 1000){
            System.out.printf("Valor de %d é maior que 1000", c);
        }else{
            System.out.printf("1ºn - %d --> Quadrado: %d", a, a*a);
            System.out.printf("\n2ºn - %d --> Quadrado: %d", b, b*b);
            System.out.printf("\n3ºn - %d --> Quadrado: %d", c, c*c);
            System.out.printf("\n4ºn - %d --> Quadrado: %d", d, d*d);
        }
        t.close();
    }
}
