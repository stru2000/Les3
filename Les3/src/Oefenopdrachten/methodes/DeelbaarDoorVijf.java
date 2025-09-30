package Oefenopdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        Scanner scanner = new Scanner(System.in);
        int chosenNumber;

        do {
            System.out.printf("Kies een getal ");
            chosenNumber = scanner.nextInt();

            if (chosenNumber % 5 != 0) {
                System.out.printf(" -> Ondeelbaar door vijf\n");
            }
        } while (chosenNumber % 5 != 0);

        System.out.printf(" >>>> Deelbaar door vijf");
        //scanner.close();



//        if (chosenNumber % 5 == 0) {
//            System.out.println("Deelbaar door vijf");
//        }else  {
//            System.out.println("Ondeelbaar door vijf");
//        }


    }
}
