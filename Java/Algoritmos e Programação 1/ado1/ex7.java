
import java.util.Scanner;

public class ex7 { 

    public static void main(String[]args) {
    Scanner ler = new Scanner (System.in);

    System.out.println("Digite o valor de altura: ");
    double a = ler.nextDouble();
    
    System.out.println("Digite o valor da base: ");
    double b = ler.nextDouble();

    double area = (b * a)/2;

    System.out.println("A área do triângulo é: " + area);

    }
}