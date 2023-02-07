//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
//inteiro entre 1 e 10. O usuário deve informar de qual número ele quer ver a tabuada.

package secao7;
import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args){
        int num;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o número para saber a tabuada: ");
        num = t.nextInt();

        while(1>num || num>10){
            System.out.print("Digite o número para saber a tabuada: ");
            num = t.nextInt();
        }
        System.out.printf("Tabuada do %d:", num);

        for(int i = 1; i <= 10; i++){
            System.out.printf("\n%d X %d = %d", num, i, (num*i));
        }
        t.close();
    }
}