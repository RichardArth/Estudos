import java.util.Scanner;


public class ex5 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            double  area, soma;

            System.out.println("Digite o valor da area:");
            area = leitor.nextDouble();

            soma = (area * area);
            System.out.println("“A área do quadrado e:" + soma);
        }

}