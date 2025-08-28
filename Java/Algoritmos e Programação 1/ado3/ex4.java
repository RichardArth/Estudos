package ado3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean Par = (numero % 2 == 0);

        System.out.println("Número é par? " + Par);

    }
}
