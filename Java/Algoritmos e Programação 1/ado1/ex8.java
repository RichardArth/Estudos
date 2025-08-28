
import java.util.Scanner;
public class ex8 { 

    public static void main(String[]args) {
        
    Scanner ler = new Scanner (System.in);

    System.out.println("Digite o valor do lado do octágono: ");
    double a = ler.nextDouble();
    
   
    double perimetro = a*8;

    System.out.println("A área do retangulo é: " + perimetro);

    }
}