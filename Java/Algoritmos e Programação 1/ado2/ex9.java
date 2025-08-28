package ado2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) { Scanner
        scanner = new Scanner(System.in);
 System.out.print("Quantidade de açaís pequenos: ");
 int pequeno = scanner.nextInt();

 System.out.print("Quantidade de açaís médios: ");
 int medio = scanner.nextInt();

 System.out.print("Quantidade de açaís grandes: ");
 int grande = scanner.nextInt();

 System.out.print("Valor do cupom de desconto (%): ");
 int cupom = scanner.nextInt();

 double subtotal = pequeno * 13.5 + medio * 15.0 + grande * 17.5;
 double total = subtotal * (1 - cupom / 100.0);
 total = Math.max(total, 0.0);

 System.out.println("Total a pagar: " + total);

}

}
