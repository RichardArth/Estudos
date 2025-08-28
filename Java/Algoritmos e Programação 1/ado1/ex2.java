import java.util.Scanner;


public class ex2 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double  dobro, soma;

            System.out.println("Digite um valor:");
            dobro = leitor.nextDouble();

            soma = (dobro) *2;
            System.out.println("O dobro de " + dobro + " é " + soma);
        }

}