package ParteUM;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de números para ser armazenados: ");
        int quantidade = leitor.nextInt();
        int[] numeros = new int [quantidade];

        for (int cont = 0; cont < numeros.length; cont++){
            System.out.print("Digite o valor para a " + (cont + 1) + "° posição: ");
            numeros [cont] = leitor.nextInt();
        }

        System.out.println("\nVocê digitou os números:");
        for (int cont = numeros.length - 1; cont >= 0; cont--){
            System.out.println(numeros[cont]);
        }
        leitor.close();
    }
}
