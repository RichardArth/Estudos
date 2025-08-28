package ado3;

import java.util.Scanner;

public class ex1 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner(System.in);
        double temperatura=0, temperaturadois=37.2;

        System.out.println ("Programa para medir a Febre");
        System.out.println ("Informe a sua temperatura: ");
        temperatura = leitor.nextDouble ();

        boolean febre = temperatura > temperaturadois;
        System.out.println ("Esta com febre: " + febre);

    }
}
