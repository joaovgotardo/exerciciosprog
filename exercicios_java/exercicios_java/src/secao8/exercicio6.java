
package secao8;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        float[] vetor = new float[5];
        int codigo;
        Scanner t = new Scanner(System.in);

        System.out.print("Informe o código: ");
        codigo = t.nextInt();

        if(codigo!=0){
            for (int i = 0; i<5; i++){
                System.out.println(vetor[i]);
                vetor[i] = t.nextFloat();
            }
            if(codigo == 1){
                for (int i =0; i<5; i++){
                    System.out.println(vetor[i]);
                }
            }if(codigo == 2){
                for (int i = (vetor.length - 1); i>= 0; i--) {
                    System.out.println(vetor[i]);
                }
            }
        }
        t.close();
    }
}
