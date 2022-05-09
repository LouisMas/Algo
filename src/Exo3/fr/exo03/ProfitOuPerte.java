package Exo3.fr.exo03;

import java.util.Scanner;

public class ProfitOuPerte {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double prixFab;
        double prixVente;
        do {
        System.out.println("Saisir le prix de fabrication");
        prixFab = scanner.nextDouble();}
        while (prixFab<0);
        do {
            System.out.println("Saisir le prix de vente");
            prixVente = scanner.nextDouble();}
            while (prixVente < 0);

        if (prixFab > prixVente) {
            System.out.printf("Perte de " + (prixVente - prixFab) + "€");
        }
        else {
            System.out.printf("Profit de " + (prixVente - prixFab) + "€");
        }
    }

}
