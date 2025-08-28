package ado2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

 System.out.print("Salário base: ");
 double salarioBase = scanner.nextDouble();

 System.out.print("Bônus (%): ");
 double bonusPercent = scanner.nextDouble();

 System.out.print("Descontos: ");
 double descontos = scanner.nextDouble();

 // Cálculo do salário líquido
 double salarioLiquido = salarioBase * (1 + bonusPercent /
100) - descontos;

 // Exibição do salário líquido
 System.out.println("Salário líquido: " + salarioLiquido);

 scanner.close();
 }

}
