package Exo5.fr.exo05;

public class LeProf {

    public static void main(String[] args) {
        double notes [] = {12,4,6,18,10,2,14,16,8,20,11,15,7};
        int taille = notes.length;

        for (int i = 0; i< taille; i++) {
            if (notes[i] <= 4)
            System.out.println("Catastrophique, il faut tout revoir");
            else if (notes[i]>= 5 && notes[i]<=10 ) {
                System.out.println("Insuffisant");
            } else if (notes[i]>=11 && notes[i]<=14) {
                System.out.println("Peut mieux faire");
            } else if (notes[i]>=15 && notes[i]<=17) {
                System.out.println("Bien");
            } else if (notes[i]>=18 && notes[i]<=20) {
                System.out.println("Excellent, bon travail");

            }
        }

    }
}
