package ado3;

import java.util.Scanner;

public class ex9 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a capacidade do tanque (em litros):");
        double capacidadeTanque = scanner.nextDouble();
        
        System.out.println("Digite a quantidade atual de combustível (em litros):");
        double combustivelAtual = scanner.nextDouble();

        boolean precisaReabastecer = combustivelAtual <= (capacidadeTanque / 4);

        System.out.println("Carro precisa ser reabastecido? " + precisaReabastecer);

    }
}
