package ado3;

import java.util.Scanner;

public class ex6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo (Verde, Amarelo ou Vermelho):");
        String cor = scanner.nextLine().trim(); 

        boolean pa = cor.equalsIgnoreCase("Verde");

        System.out.println("Pode atravessar? " + pa);

    }
}
