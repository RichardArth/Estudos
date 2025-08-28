import java.util.Scanner;


public class ex3 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double  triplo, soma;

            System.out.println("Digite um valor:");
            triplo = leitor.nextDouble();

            soma = (triplo) *3;
            System.out.println("O triplo de " + triplo + " é " + soma);
        }

}