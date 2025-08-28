package ado3;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o diâmetro do primeiro cilindro:");
        double diametro1 = scanner.nextDouble();
        
        System.out.println("Digite a altura do primeiro cilindro:");
        double altura1 = scanner.nextDouble();

        System.out.println("Digite o diâmetro do segundo cilindro:");
        double diametro2 = scanner.nextDouble();
        
        System.out.println("Digite a altura do segundo cilindro:");
        double altura2 = scanner.nextDouble();

        double raio1 = diametro1 / 2;
        double volume1 = Math.PI * Math.pow(raio1, 2) * altura1;

        double raio2 = diametro2 / 2;
        double volume2 = Math.PI * Math.pow(raio2, 2) * altura2;

        boolean podeTransferir = volume1 <= volume2;

        System.out.println("O primeiro cilindro tem volume de " + volume1);
        System.out.println("O segundo cilindro tem volume de " + volume2);
        System.out.println("É possível transferir o primeiro para o segundo? " + podeTransferir);

        scanner.close();
    }
}
