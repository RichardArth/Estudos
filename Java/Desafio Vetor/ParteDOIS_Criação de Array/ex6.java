
import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        char[] caracteres = new char[frase.length()];

        for (int cont = 0; cont < frase.length(); cont++) {
            caracteres[cont] = frase.charAt(cont);
            System.out.println(caracteres[cont]);
        }
        leitor.close();

    }
}
