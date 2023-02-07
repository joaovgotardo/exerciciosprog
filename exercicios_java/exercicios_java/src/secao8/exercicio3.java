//Faça programa q carregue vetor com 10 numeros 
//inteiros, mostrar na ordem inversa q foi digitado.

package secao8;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        int vetor[] = new int[10];
        Scanner t = new Scanner(System.in);

        for (int i = 0; i<10; i++){
            System.out.println("Informe o valor para o vetor: ");
            vetor[i] = t.nextInt();
        }for (int i = (vetor.length - 1); i>= 0; i--){
            System.out.println(vetor[i]);
        }
        t.close(); 
    }
}
