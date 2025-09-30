package Oefenopdrachten.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {



        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 909909, 888));

        System.out.println(sortList(wrongList));
        System.out.println(sortList(correctList));


    }

    public static String sortList(List<Integer> lijst) {

        int correctSize = 3;

        if (lijst.size() > correctSize) {
            return "Te veel";
        } else if (lijst.size() < correctSize) {
            return "Te weinig";

        } else{

            int a = lijst.get(0);
            int b = lijst.get(1);
            int c = lijst.get(2);
            int temp;

            if (a > b) {
                temp = a;
                a = b;
                b= temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }if (a > c){
                temp = a;
                a = c;
                c = temp;
            }

            List<Integer> gesorteerdeLijst = new ArrayList<>();
            gesorteerdeLijst.add(a);
            gesorteerdeLijst.add(b);
            gesorteerdeLijst.add(c);

            return gesorteerdeLijst.toString();

        }
    }
}
