import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        //int Physik, Mathe, Chemie, Deutsch ;
        // double Durchschnitt;

        System.out.println("Gib Physik Note ein  : ");

        int Physik =input.nextInt();

        System.out.println("Gib Mathe Note ein  : ");
        int Mathe=input.nextInt();

        System.out.println("Gib Chemie Note ein  : ");
        int Chemie = input.nextInt();

        System.out.println("Gib Deutsch Note ein  : ");
        int Deutsch=input.nextInt();


        double Durchschnitt = ((Physik+Mathe+Chemie+Deutsch)/4);
        System.out.println("Ergebnis : " + (Durchschnitt<50 ? "Durcfallen:/" : "Bestanden! :)"));



    }
}
