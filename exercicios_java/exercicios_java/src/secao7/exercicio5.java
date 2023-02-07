//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
//igual ao nome do usuário, mostrando um erro e voltando a pedir informações.

package secao7;
import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args){
        String user, passw;
        Scanner t = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        user = t.next();
        System.out.print("Digite seu nome de usuário: ");
        passw = t.next();

        while(user.equals(passw)){ //o método equals é usado no java para comparações entre strings
            System.out.print("Digite sua senha: ");
            user = t.next();
            System.out.print("Digite seu nome de usuário: ");
            passw = t.next();
        }  
        t.close();     
    }
}
