//- O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para
//0,3 as indústrias do 1º grupo são intimadas a suspender atividade, se for maior
//que 0,4, do 1º e 2º grupo, se for 0,5, todos os grupos devem paralisar atividades.

package secao6;
import java.util.Scanner;

public class exercicio9{
    public static void main(String[] args){
        float ind;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o índice de poluição: ");
        ind = t.nextFloat();

        if (ind >= 0.05 && ind < 0.25){
            System.out.print("Índice de poluição aceitável");
        }else if (ind >= 0.25 && ind < 0.4){
            System.out.print("Empresas do primeiro grupo devem paralisar");
        }else if (ind >= 0.4 && ind < 0.5){
            System.out.print("Empresas do primeiro e segundo grupo devem paralisar");
        }else if (ind >= 0.5){
            System.out.print("Todas as empresas devem paralisar");
        }else{
            System.out.print("Índice inválido");
        }

        t.close();
    }
}