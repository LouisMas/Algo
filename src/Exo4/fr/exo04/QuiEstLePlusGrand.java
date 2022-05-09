package Exo4.fr.exo04;

import java.util.Scanner;

public class QuiEstLePlusGrand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb1;
        int nb2;
        int nb3;

            System.out.println("Entrez le premier chiffre");
            nb1 = scanner.nextInt();
            System.out.println("Entrez le deuxieme chiffre");
            nb2 = scanner.nextInt();
            System.out.println("Entrez le troisieme chiffre");
            nb3 = scanner.nextInt();

            if (nb1 > nb2 && nb1 > nb3) {
                System.out.println("[" + nb1 + "," + nb2 + "," +  nb3 + "]" + "-->" + nb1);}
                else if (nb2 > nb3 && nb2 > nb1) {
                    System.out.println("[" + nb1 + "," + nb2 + "," + nb3 + "]" + "-->" + nb2);}
            else if (nb3 > nb1 && nb3 > nb2) {
                System.out.println("[" + nb1 + "," + nb2 + "," + nb3 + "]" + "-->" + nb3);}
            }
        }


