package Oefenopdrachten.methodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        List<String> updatedList = new ArrayList<>(curstomerNames);
        
        System.out.println("Origineel :"+curstomerNames);
        System.out.println("test: "+ formatName("mo el-mecky"));

        List<String> formattedList = new ArrayList<>();
        for (String name : updatedList) {
            formattedList.add(formatName(name));
        }
        System.out.println("Updated: " + formattedList);

        for (String name : updatedList) {
            System.out.println(formatName(name));
        }
    }

    public static String formatName(String unEditedName) {
        String regex = "[ -]+";

        //sla de afzonderlijke woorden op in een array
        String[] nameParts = unEditedName.split(regex);
        //maak een string aan om het resultaat op te bouwen
        String formattedName = "";
        String spaceCharacter = " ";

        for (int i = 0; i < nameParts.length; i++) {
            String currentWord = nameParts[i];

            if (currentWord.equals("el")) {
                formattedName = formattedName + currentWord+"-";

            } else if (i < nameParts.length - 1) {
                formattedName = formattedName + capitalizeWord(currentWord) + spaceCharacter;


            }else {
                    //formatted name is ofwel leeg ofwel spatie
                    formattedName = formattedName + capitalizeWord(currentWord);
                }
            }

//        //hier ga je de code nog compacter schrijven //
//        for (int i = 0; i < nameParts.length; i++) {
//            String currentWord = nameParts[i];
//
//            if (i>0){
//                formattedName = formattedName+ " ";
//            }
//
//            //formatted name is ofwel leeg ofwel spatie
//            formattedName = formattedName + currentWord;//
//        }

        return formattedName; }

    public static String capitalizeWord(String lowerCaseName) {
        String[] ignoredPrefix = {"de","van","el","den"};
        if (Arrays.asList(ignoredPrefix).contains(lowerCaseName))  {
            return lowerCaseName;
        }else {
            return lowerCaseName.substring(0, 1).toUpperCase() + lowerCaseName.substring(1);
        }

    }
}




