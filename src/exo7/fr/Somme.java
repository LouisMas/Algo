package exo7.fr;

import java.util.Scanner;

public class Somme {

    public static void main(String[] args) {
        
        int nombre;
        int resultat = 0;
        Scanner scanNb = new Scanner(System.in);
        System.out.println("Entrez votre chiffre : ");
        nombre = scanNb.nextInt();
        
        for (int i = 1; i <=nombre; i++) {
            resultat += i;
            if (i != nombre) {
                System.out.printf(i + " + ");
            } else {
                System.out.println(i + " = ");
            }

        }
        System.out.printf("" + resultat);
    }
}
