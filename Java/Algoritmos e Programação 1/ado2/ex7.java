package ado2;

import java.util.Scanner;

public class ex7 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de açaís: ");
    int quantidade = scanner.nextInt();

    double total = quantidade * 13.5;

    System.out.println("Total a pagar: " + total);

    }

}
