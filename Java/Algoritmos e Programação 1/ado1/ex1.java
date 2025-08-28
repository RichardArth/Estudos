
import java.util.Scanner;


public class ex1 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double  valor1, valor2, soma;

            System.out.println("Digite o primeiro valor:");
            valor1 = leitor.nextDouble();

            System.out.println("Digite o segundo valor:");
            valor2 = leitor.nextDouble();

            soma = (valor1 + valor2);
            System.out.println("O valor da soma e:" + soma);
        }

}