//Elabore um algoritmo que leia c e n, código e número de horas trabalhadas. 
//Calcule o salário sabendo-se que ele ganha RS 10,00 por hora. Quando exceder 50, calcule
//o excesso na variável e. Caso contrário, zerar. A hora excedente vale 20. Imprimir
//salário total e excedente.

package secao6;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        int c; float ht, e = 0;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite seu código:");
        c = t.nextInt();
        System.out.print("Digite quantas horas você trabalhou: ");
        ht = t.nextFloat();

        System.out.print("Código: "+ c);
        if (ht>50){
            e = ht - 50;
            System.out.printf("\nO salário total é de R$%.2f", (((ht-e)*10)+(e*20)));
            System.out.printf("\nO salário excedente é de R$%.2f", (e*20));
        }else{
            System.out.printf("\nO salário total é de R$%.2f", (ht*10));
            System.out.printf("\nO salário excedente é de R$%.2f", (e*20));
        }
        t.close();
    }
}
