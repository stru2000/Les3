package Oefenopdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaakie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        System.out.println("laResistanceMembers: "+laResistanceMembers);


        System.out.println("--- Lijst van Leden ---");
        System.out.println("Onversleuteld: " + laResistanceMembers);

        // Opdracht 2: Versleutelen
        List<String> versleuteld = encryptMembers(laResistanceMembers);
        System.out.println("Versleuteld:   " + versleuteld);

        // Opdracht 3: Ontsleutelen
        List<String> ontsleuteld = decryptMembers(versleuteld);
        System.out.println("Ontsleuteld:   " + ontsleuteld);
        System.out.println("--- Controle ---");
        System.out.println("Klopt de ontsleutelde lijst? " + laResistanceMembers.equals(ontsleuteld));

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static List<String> addMembers(List<String> members, String name) {

//        boolean foundMember =  false;
//        for (int i = 0; i < members.size(); i++) {
//            if(members.get(i).equals(name)) {
//                foundMember = true;
//                break;
//            }
//        }
//        if(!foundMember) {members.add(name);}
//        return members;

        // Eleganter
        if (!members.contains(name)) {members.add(name);}return members;
    }


    private static List<String> encryptMembers(List<String> members){
    return members;
    }

    private static List<String> decryptMembers(List<String> members){return members;}
}