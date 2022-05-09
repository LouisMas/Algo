package Exo1.fr;


import java.util.Scanner;

public class Bienvenue {

    public static void i () {

        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez votre nom");
            username = scanner.next();


        System.out.printf("Bienvenue " + username);
    }

}
