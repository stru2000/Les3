package Oefenopdrachten.methodes;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {

    static void main(String[] args) {

        //int max = 0;
        List<Integer> lijst1 = Arrays.asList(4,4);
        List<Integer> lijst2 = Arrays.asList(4);
        List<Integer> lijst3 = Arrays.asList(6,6,45,12,10,46);
        List<Integer> lijst4 = Arrays.asList(9,8,7,6,5,4,3,2,1,0);
        List<Integer> lijst5 = Arrays.asList(-1,-10,-100);

        System.out.println(checkMax(lijst1));
        System.out.println(checkMax(lijst2));
        System.out.println(checkMax(lijst3));
        System.out.println(checkMax(lijst4));
        System.out.println(checkMax(lijst5));

    }

    public static String checkMax(List<Integer> lijst){

        String antwoord = "";
        int max = lijst.get(0);

        if(lijst.size()>=2) {

            //A: kan in feite ook bij int=1 starten aangezien we index 0 als uitgangspunt nemen voor max
            for (int i = 0; i < lijst.size(); i++) {

                if (max <= lijst.get(i)) {
                    max = lijst.get(i);
                //A: dan kan de else ook verwijderd worden
                }else  {
                    max = max;
                }
            }


        }else{
                antwoord = "Niet voldoende getallen in de lijst";
                return antwoord;
            }

        antwoord = "Het hoogste getal van de gegeven getallen is: ";
        return antwoord + max;

    }

}
