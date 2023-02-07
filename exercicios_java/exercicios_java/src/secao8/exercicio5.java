package secao8;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        boolean mq50 = false;
        Scanner t = new Scanner(System.in);

        for (int i =0; i< 10; i++){
            System.out.print("Informe o valor para o vetor: ");
            vetor[i] = t.nextInt();
        }

        for (int i = 0; i<10; i++){
            if(vetor[i] > 50){
                System.out.printf("Nº %d na posição %d\n", vetor[i], i);
                mq50 = true;
            }if(! mq50){
                System.out.println("Sem número maior que 50");
            }
        }
        t.close();
    }
}
