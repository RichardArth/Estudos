package ado3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do primeiro retângulo: ");
        int base1 = scanner.nextInt();

        System.out.print("Digite a altura do primeiro retângulo: ");
        int altura1 = scanner.nextInt();

        System.out.print("Digite a base do segundo retângulo: ");
        int base2 = scanner.nextInt();

        System.out.print("Digite a altura do segundo retângulo: ");
        int altura2 = scanner.nextInt();

        int area1 = base1 * altura1;
        int area2 = base2 * altura2;

        System.out.println("O primeiro retângulo possui área " + area1);
        System.out.println("O segundo retângulo possui área " + area2);
        System.out.println("Eles são iguais? " + (area1 == area2));

    }
}
