package ParteUM;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a Quantidade de números para armazenar: ");
        int quantidade = leitor.nextInt();
        leitor.nextLine();
        int[] numero = new int[quantidade];

        for (int cont = 0; cont < numero.length; cont++) {
            System.out.print("Digite o " + (cont + 1) + "° número: ");
            numero[cont] = leitor.nextInt();
        }

        System.out.println("\nVocê digitou os números:");
        for (int numeros : numero) {
            System.out.println(numeros);
        }
        leitor.close();
    }
}
