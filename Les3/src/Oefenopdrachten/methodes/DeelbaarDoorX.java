package Transfer.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {

    public static void main(String[] args) {

        int number;
        int divisible;
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Enter number: ");
        number=scanner.nextInt();
        System.out.printf("Enter divisible: ");
        divisible=scanner.nextInt();

        System.out.println(checkDivision(number,divisible));

    }

    public static String checkDivision(int number, int divisible){

        if (number % divisible == 0) {
            return number + " is deelbaar door " + divisible;
        } else {
            return number + " is niet deelbaar door " + divisible + "\n"+ nextNumberHelper(number, divisible);
        }
    }

    public static String nextNumberHelper(int number, int divisible){

        int restWaarde = number % divisible;
        double helftDivisible = divisible/2.0;
        int volgendDeelbaar;
        String volgendeActie;


        if (restWaarde > helftDivisible) {
            volgendDeelbaar = divisible - restWaarde;
            volgendeActie = "Verhoog het getal met " + volgendDeelbaar;
        } else if (restWaarde < helftDivisible) {
            volgendDeelbaar = restWaarde;
            volgendeActie = "Verlaag het getal met " +  volgendDeelbaar;
        }else {
            // dus indien restwaarde gelijk is aan de helft van de deler
            volgendDeelbaar = restWaarde;
            volgendeActie = "Verhoog of verlaag het getal met " + volgendDeelbaar;
        }

        return volgendeActie;

    }

}