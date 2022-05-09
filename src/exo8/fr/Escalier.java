package exo8.fr;

import java.util.Scanner;

public class Escalier {

    public static void main(String[] args) {

        int nombre;

        Scanner scanNb = new Scanner(System.in);
        System.out.println("Entrez le nombre de colones souhaitees : ");
        nombre = scanNb.nextInt();

        String resultat = "";
        int k = 0;
        for (int i = 1; i <= nombre; i++) {
            resultat += "*";
            System.out.println(resultat);
        }
            for (int j = nombre; j >1; j--) {
                k += 1;
                System.out.println(resultat.substring(k));

        }
    }
}
