import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Programa da tabuada");

        System.out.print("\nInforme um número: ");
        int numero = leitor.nextInt();

        int[] tabuada = new int[11]; 

        for(int cont = 0; cont <= 10; cont++){
            tabuada[cont] = numero * cont;
        }

        System.out.println("A tabuada do " + numero + " é:");
        for (int cont = 0; cont <= 10; cont++){
            System.out.println(tabuada[cont]);
        }
    }
}