package Exo2.fr.exo2;


import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez le premier chiffre");
        i = scanner.nextInt();
        System.out.println("Veuillez entrez le deuxieme chiffre");
        j = scanner.nextInt();
        System.out.println("Le total est : ");
        System.out.println(i + j);
        System.out.println("Le total de " + i + " + " + j + " = " + (i+j));

    }
}
