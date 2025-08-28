
import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nPrograma de ingresso");

        System.out.print("\nInforme a quantidade de ingressos: ");
        int qtd = leitor.nextInt();
        leitor.nextLine();

        System.out.print("\nInforme um código de cupom para o ingresso: ");
        String cupom = leitor.nextLine();
        

        String[] ingresso = new String[qtd]; 

        for(int cont = 0; cont < qtd; cont++){
            ingresso[cont] = cupom + "_" + (cont + 1);
        }

        System.out.println("\nOs ingressos gerados foram:");
        for(String ingressos : ingresso){
            System.out.println(ingressos);
        }
        leitor.close();
    }
}
