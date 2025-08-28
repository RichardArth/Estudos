package ado3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        boolean acimaDoPeso = imc >= 25;

        System.out.println("Seu IMC é " + imc);
        System.out.println("Está acima do peso ideal? " + acimaDoPeso);

    }
}
