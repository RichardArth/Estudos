package ado2;

import java.util.Scanner;

public class ex4 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);
        

        System.out.println  ("Programa de converter Dólar para Reais");
        System.out.println ("Informe o valor do Reais ");
        double reais = leitor.nextDouble ();

        //*Para converter Reais para Dólar 1 * 5,16

        double dolar = (reais * 5.16);
    
        System.out.println ("O valor valor do Reais em Dólar é " + dolar);

    }
}
