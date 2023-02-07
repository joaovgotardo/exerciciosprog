//Faça um algoritmo que leia p (peso de peixes), verifique se há excesso
//(maior que 50kg), gravar na variável e (excesso), na variável m o valor da multa,
//4 reais vezes peso. Caso contrário, mostrar variáveis como zero.

package secao6;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        int p, e = 0; float m = 0;
        Scanner t = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes: ");
        p = t.nextInt();

        if (p>50){
            e = p - 50;
            m = e*4;
            System.out.printf("O excesso de peso é %dkg, e a multa é de R$ %.2f", e, m);
        }else{
            System.out.printf("O excesso de peso é %dkg, e a multa é de R$ %.2f", e, m);
        }
        t.close();
    }
}
