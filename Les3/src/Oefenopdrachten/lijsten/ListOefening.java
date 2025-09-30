package Oefenopdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
        System.out.println("---- VRAAG -1 -----");
        System.out.println(clubNames);
        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        System.out.println("---- VRAAG 0 Eerste methode -----");
        int index = 0;
        for(String clubName : clubNames) {
            System.out.println(index + " - " +clubName);
            index++;
        }

        System.out.println("----VRAAG 0 Tweede methode-----");
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println((i + " - " + clubNames.get(i)));
        }
        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        System.out.println("----VRAAG 1 -----");
        System.out.printf("Kies een ploeg: ");
        Scanner scanner = new Scanner(System.in);
        String gekozenPloeg = scanner.nextLine();
        System.out.println(checkExistingAndAdd(clubNames,gekozenPloeg));
        System.out.println(clubNames);

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        System.out.println("----VRAAG 2 -----");
        System.out.println(checkPosition(clubNames,gekozenPloeg));


        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        System.out.println("----VRAAG 3 -----");
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");
        System.out.println("Niet gesorteerd: \n"+clubNames);
        System.out.println("Gesorteerd en alles verwijderd vóór " + gekozenPloeg);
        System.out.println(sortClubs(clubNames,gekozenPloeg));


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        System.out.println("----VRAAG 4 -----");
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");
        System.out.println("Niet gesorteerd: \n"+clubNames);
        System.out.println("Gesorteerd en alles verwijderd ná " + gekozenPloeg);
        System.out.println(sortClubs(clubNames,gekozenPloeg));



    }

    // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.

    //String[] is array en arrays kunnen geen .add doen -> List<String>
    public static String checkExistingAndAdd(List<String> clubCheck, String clubToCheck) {

        boolean gevonden = false;
        for (int i = 0; i < clubCheck.size(); i++) {
            if (clubCheck.get(i).equalsIgnoreCase(clubToCheck)) {
                gevonden = true;
                break;
            }
        }
        if (!gevonden) {
            clubCheck.add(clubToCheck);
            return "Niet gevonden, "+"'"+ clubToCheck+ "'" + " werd toegevoegd aan de lijst";
        }else  {
            return "'"+ clubToCheck+ "'" + " staat al in de lijst";
        }

    }

    // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

    public static String checkPosition(List<String> clubCheck, String clubToCheck) {

        int position = clubCheck.indexOf(clubToCheck)+1;
        return "Ploeg " + clubToCheck+ " staat op positie " + position;
    }



    // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
    // clubs die voor Ajax staan verwijderd worden.
    // We voegen nog wat clubs toe om de code te kunnen testen.

    public static String sortClubs(List<String> clubCheck, String clubToCheck) {
        Collections.sort(clubCheck);
        int positie = clubCheck.indexOf(clubToCheck);

//        //best practice, zonder loop
//        // Stap 1: Vind de index van de club (de 'cut-off' positie)
//        int cutOffIndex = clubCheck.indexOf(clubToCheck);
//
//        // Stap 2: Verwijder de elementen van index 0 tot cutOffIndex
//        clubCheck.subList(0, cutOffIndex).clear();

        for (int i = 0; i < positie; i++) {
            //dit is niet BP maar wel logisch
            //want dit wordt loop per loop gedaan dus altijd eerst bij index 0
            //daarna schuift alles verder terug -1 dus nieuwe index 0
            clubCheck.remove(0);
        }

        return clubCheck.toString();
    }

    public static String sortClubsBis(List<String> clubCheck, String clubToCheck) {
        Collections.sort(clubCheck);
        int positie = clubCheck.indexOf(clubToCheck);

        for (int i = 0; i < positie; i++) {

            clubCheck.remove(clubCheck.getLast());
        }

        return clubCheck.toString();
    }



    // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.


}
