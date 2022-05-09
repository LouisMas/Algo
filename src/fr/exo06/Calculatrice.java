package fr.exo06;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {

        double nb1;
        double nb2;
        Scanner scanChif = new Scanner(System.in);
        System.out.println();
        System.out.print(" chiffre 1 : ");
        nb1 = scanChif.nextDouble();
        System.out.println();
        System.out.print(" chiffre 2 : ");
        nb2 = scanChif.nextDouble();

            System.out.println();
                System.out.print(" choice : ");
        String choice = scanChif.next();


        switch (choice) {
            case "*" -> System.out.printf("%f * %f = %f", nb1, nb2, nb1 * nb2);
            case "/" -> System.out.printf("%f / %f = %f", nb1, nb2, nb1 / nb2);
            case "+" -> System.out.printf("%f + %f = %d", nb1, nb2, nb1 + nb2);
            case "-" -> System.out.printf("%f - %f = %d", nb1, nb2, nb1 - nb2);
        };


    }
 }


