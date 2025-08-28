
import  java.util.*;

public class ex1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] numeros = new int[5];

     
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "° número: ");
            numeros[i] = leitor.nextInt();
        }

        System.out.println("\nVocê digitou os números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        leitor.close();


    }
}