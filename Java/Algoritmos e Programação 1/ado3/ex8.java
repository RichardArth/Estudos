package ado3;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do livro:");
        String nomeLivro = scanner.nextLine();
        
        System.out.println("Digite o total de páginas:");
        int totalPaginas = scanner.nextInt();
        
        System.out.println("Digite o tempo de leitura por página (em segundos):");
        double tempoPorPagina = scanner.nextDouble();

        double tempoTotalHoras = (totalPaginas * tempoPorPagina) / 3600;

        System.out.printf("Você lerá " + nomeLivro + " em " + tempoTotalHoras + " horas.");

    }
}
