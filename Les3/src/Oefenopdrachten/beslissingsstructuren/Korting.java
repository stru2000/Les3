package Oefenopdrachten.beslissingsstructuren;
import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Wat is het aankoopbedrag?");
        double aankoopBedrag = userInputScanner.nextDouble();
        double tienProcent = aankoopBedrag * 0.90;
        double zestienProcent = aankoopBedrag * 0.84;

        if(aankoopBedrag < 75){
            System.out.println( "De klant krijgt geen korting. Het aankoopbedrag blijft "+aankoopBedrag );
        }else if(aankoopBedrag <= 300){
            System.out.println("De klant krijgt 10% korting. Het aankoopbedrag is nu: "+tienProcent);
        }else if(aankoopBedrag >= 300.01){
            System.out.println("De klant krijgt 16% korting. Het aankoopbedrag is nu: "+zestienProcent);
        }

        /*
        Hierboven is het aankoopbedrag ingevoerd. Het is de bedoeling dat jij de korting bepaalt en het nieuwe bedrag
        uitrekent.

        Wanneer het ingevoerde bedrag onder de 75 is, krijgt de klant geen korting. Print uit:
        "De klant krijgt geen korting. Het aankoopbedrag blijft -HIER HET BEDRAG-"

        Wanneer het ingevoerde bedrag 75,00 of hoger is, maar kleiner of gelijk aan 300.00 dan krijgt de klant 10%
        korting. Print uit:
        "De klant krijgt 10% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"

        Wanneer het ingevoerde bedrag 300.01 of hoger is, krijgt de klant 16% korting. Print uit:
        "De klant krijgt 16% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"
         */

    }
}
