package Oefenopdrachten.whilelussen;

public class OnevenTeller {
    public static void main(String[] oneven) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de oneven getallen uit!
         */
        int teller = 0;

        while (teller < 11) {
            if (teller%2!=0) {
                System.out.println(teller);
            }
            teller++;
        }

    }
}
