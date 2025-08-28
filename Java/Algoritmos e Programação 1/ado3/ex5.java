package ado3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o personagem de Friends que trabalha com TI?");
        String resposta = scanner.nextLine().trim(); 

        boolean correta = resposta.equalsIgnoreCase("Chandler");

        System.out.println("Resposta correta: " + correta);

    }
}
