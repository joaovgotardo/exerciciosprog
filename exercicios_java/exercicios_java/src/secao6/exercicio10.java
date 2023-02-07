//Algoritmo que lê idades de um nadador, categorias:
//infantil-a = 5 a 7
//infantil-b = 8 a 11
//juvenil-a = 12 a 13
//juvenil-b = 14 a 17

package secao6;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        int idd;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        idd = t.nextInt();

        if (idd >= 5 && idd <= 7){
            System.out.print("Infantil-A");
        }else if (idd >= 8 && idd <= 11){
            System.out.print("Infantil-B");
        }else if (idd >= 12 && idd <= 13){
            System.out.print("Juvenil-A");
        }else if (idd >= 14 && idd <= 17){
            System.out.print("Juvenil-B");
        }else if (idd >= 18){
            System.out.print("Adulto");
        }else{
            System.out.print("Novo demais ou idade inválida");
        }

        t.close();
    }
}
