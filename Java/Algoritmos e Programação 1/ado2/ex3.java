package ado2;

import java.util.Scanner;

public class ex3 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);
        double kilos=0, Grama = 0;

        System.out.println  ("Programa de converter KG para G");
        System.out.println ("Informe o valor do KG ");
        double kilo = leitor.nextDouble ();

        //*Para converter para grama /1000  */

     double grama = kilo /1000;

        System.out.println ("O valor da grama é:  " + grama);

    }
}
