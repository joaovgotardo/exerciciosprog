//Algoritm oque pergunte quando você ganha por hora, horas trabalhadas, calcule
//e mostre o total do seu salário no referido mês.
package secao3;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        float gh, ht;
        Scanner t = new Scanner (System.in);

        System.out.print("Digite o quanto voce ganha por hora: ");
        gh = t.nextFloat();
        System.out.print("Digite quantas horas você trabalhou: ");
        ht = t.nextFloat();

        System.out.print("Seu salário mensal é de: R$" + gh*ht);
        t.close();
    }
}
