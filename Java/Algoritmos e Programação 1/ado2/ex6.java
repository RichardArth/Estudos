
package ado2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Capacidade do tanque: ");
        int capacidade = scanner.nextInt();

        System.out.print("Consumo do veículo: ");
        int consumo = scanner.nextInt();

        System.out.print("Distância da viagem: ");
        int distancia = scanner.nextInt();

        int kmPorTanque = capacidade * consumo;

        int paradas = (distancia + kmPorTanque - 1) / kmPorTanque;

        paradas += (distancia % kmPorTanque == 0) ? 1 : 0;

        System.out.println("Você precisará fazer " + paradas + " parada para abastecer.");

    }
}
