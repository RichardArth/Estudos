package ado2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) { Scanner
        scanner = new Scanner(System.in);

    System.out.print("Quantidade de açaís pequenos: ");
    int pequeno = scanner.nextInt();

    System.out.print("Quantidade de açaís médios: ");
    int medio = scanner.nextInt();

    System.out.print("Quantidade de açaís grandes: ");
    int grande = scanner.nextInt();

    double total = pequeno * 13.5 + medio * 15.0 + grande * 17.5;

    System.out.println("Total a pagar: " + total);

    }

}
