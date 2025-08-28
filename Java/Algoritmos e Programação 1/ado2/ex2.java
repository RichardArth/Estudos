package ado2;

import java.util.Scanner;

public class ex2 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);
        double valorcompra=0;

        System.out.println  ("Programa de compra");
        System.out.println ("Informe o valor da compra: ");
        valorcompra = leitor.nextDouble ();

        //*Para aplicar o desconto vamos usar a formula valor final = valor * (percentual / desconto em %); */

        System.out.println ("Informe o valor do desconto");
        double desconto = leitor.nextDouble();

        double valorfinal = valorcompra - (valorcompra * (desconto/100));

        System.out.println ("O valor do desconto é:  " + valorfinal);

    }
}
