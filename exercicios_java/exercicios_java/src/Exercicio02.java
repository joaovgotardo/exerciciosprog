//o nome da classe deve ser o mesmo do arquivo
    //classe - uma definição para um conjunto de objetos semelhantes
    //objeto - é um dado ou uma informaçao q pode assumir diferentes funçoes com diferentes formas
    //instancia - a classe em si é um conceito abstrato, como um molde, que se torna 
    //concreto e palpável através da criação de um objeto. Chamamos essa criação de 
    //instanciação da classe, como se estivéssemos usando esse molde (classe) para 
    //criar um objeto.

//Algoritmo que multiplica um primeiro número pelo segundo.

import java.util.Scanner; //importa scanner para um input do user.

public class Exercicio02 { 
    // public - O metodo pode ser acessado por qualquer classe;
    // static - a classe nao precisa ser instanciada para chamar o metodo
    // void - tipo de retorno do metodo
    // main - funçao q executa o codigo
    // string[] - um vetor de strings
    // args - o nome da variavel do vetor
    // system.out - sera um output 
    // println - printa algo na tela
    public static void main(String[] args) {
        int num1, num2, soma, multiplicacao;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;
        multiplicacao = soma * num1;

        System.out.println("Resultado: " + multiplicacao);
        teclado.close();

    }
}
