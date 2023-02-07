//Fazer algoritmo q carregue vetor de 5 elementos inteiros e armazene em um vetor só os pares maiores 
//que 0. Mostrar elementos do vetor na tela.

package secao8;
import java.util.ArrayList;

public class exercicio1 {
    public static void main(String[] args){
        //a estrutura de dados usada no java é a collection, sendo mais poderosa que arrays
        //
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();

        for(int i = 0; i<5; i++){
            vetor.add(i);
            if (i%2 == 0 && i>0){
                pares.add(i);
            }
        }
        for(Integer n : pares){
            System.out.print(n + "\n");
        }
    }
}
