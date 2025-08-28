package ParteUM;
import java.util.*;

public class ex2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String [] nomes = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int cont = 0; cont < nomes.length; cont++){
            System.out.print((cont + 1) + "° Nome: ");
            nomes[cont] = leitor.nextLine();
        }

        System.out.println("Você digitou os nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        leitor.close();
    }
}
