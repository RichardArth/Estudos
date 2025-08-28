import java.util.Scanner;


public class ex4 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double  metade, soma;

            System.out.println("Digite um valor:");
            metade = leitor.nextDouble();

            soma = (metade) /2;
            System.out.println("A metade de " + metade + " é " + soma);
        }

}