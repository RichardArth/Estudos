import java.util.Scanner;
public class ex9 { 

    public static void main(String[]args) {
    Scanner ler = new Scanner (System.in);

    System.out.println("Digite o valor da 1° nota: ");
    double p = ler.nextDouble();
    
    System.out.println("Digite o valor da 2° nota: ");
    double s = ler.nextDouble();

    System.out.println("Digite o valor da 3° nota : ");
    double t = ler.nextDouble();

    double media = (p + s + t)/3;

    System.out.println("A área do retangulo é: " + media);

    }
}