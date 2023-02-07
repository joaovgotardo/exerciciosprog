//Faça um algoritmo para "Calcular o estoque médio de uma peça, sendo que:"
//estoque medio = (quantidade mínima + quantidade máxima)/2

package secao3;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        int qminima, qmaxima, estmedio;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade mínima: ");
        qminima = teclado.nextInt();
        System.out.println("Digite a quantidade máxima: ");
        qmaxima = teclado.nextInt();
        
        estmedio = (qminima + qmaxima)/2;

        System.out.println("O estoque médio é de: " + estmedio);

        teclado.close();
    }
}
