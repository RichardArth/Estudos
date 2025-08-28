package ado2;

import java.util.Scanner;

public class ex5 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);
        

        System.out.println  ("Programa do parcelamento");
        System.out.println ("Informe o valor da Compra ");
        double valorcompra = leitor.nextDouble ();

        System.out.println ("Informe quantas parcelas ");
        int parcelas = leitor.nextInt ();
    

        double valorparcelas = valorcompra / parcelas;
    
        System.out.println ("O valor valor da parcela é: " + valorparcelas);

    }
}
