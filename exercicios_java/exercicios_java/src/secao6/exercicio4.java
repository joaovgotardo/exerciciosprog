//Tendo como entrada a altura e sexo, construa um algoritmo que calcule seu peso
//ideal. Homens: (72.7*altura)-58; Mulheres (62.1*altura) - 44.7
package secao6;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        float alt, pid;
        char sx;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite seu sexo (M/F): ");
        sx = t.next().charAt(0);
        System.out.print("Digite sua altura: ");
        alt = t.nextFloat();

        //diferença - '' char; "" string;

        if(sx == 'm'){
            pid = (float)(72.7*alt)-58;
            System.out.printf("Seu peso ideal é %.1f kg", pid);
        }else if(sx == 'f'){
            pid = (float)(62.1*alt-(float)44.7);
            System.out.printf("Seu peso ideal é %.1f kg", pid);
        }else{
            System.out.print("Sexo inválido");
        }

        t.close();
    }
}
