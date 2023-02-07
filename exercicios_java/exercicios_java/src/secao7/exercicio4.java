//Construa um algoritmo que leia 10 valores inteiros e positivos e:
//a) Encontre o maior 
//b) Encontre o menor
//c) Calcule a média dos números lidos


package secao7;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        int n, manum = -999, minum = 999, soma = 0;
        Scanner t = new Scanner(System.in);

        for (int i =0; i<= 9; i++){
            System.out.print("Digite um valor: ");
            n = t.nextInt();
            soma += n;
            if (n>manum){
                manum = n;
            }if (minum>n){
                minum = n;
            }
        }System.out.print("O maior número do loop: " + manum);
        System.out.print("\nO menor número do loop: " + minum);
        System.out.print("\nA média de números do loop: " + (float)soma/10);
        t.close();
    }
}
