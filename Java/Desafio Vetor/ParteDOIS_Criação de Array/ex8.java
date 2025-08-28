
import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nInforma a quantidade de números: ");
        int qtd = leitor.nextInt();
        leitor.nextLine();

        int[] numeros = new int[qtd];

        for(int cont = 0; cont < qtd; cont++){
            numeros[cont] = random.nextInt(101);
        }
        System.out.println("\nOs números gerados aleatoriamente foram:");
        for(int numero : numeros){
            System.out.println(numero);
        }
        leitor.close();
    }
}
