//Tendo como entrada a altura da pessoa, construa um algoritmo que calcule seu
//peso ideal, formula: (72.7*altura) - 58
package secao3;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        float alt;
        float pid;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        alt = t.nextFloat();

        pid = (float)(72.7*alt-58);
        System.out.printf("Seu peso ideal é de %.1f kg", pid);

        t.close();
    }
    
}
