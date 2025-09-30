package Oefenopdrachten.whilelussen;

public class Teller {
    public static void main(String[] args) {

        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Elke keer wanneer de teller wordt opgehoogd moet deze uitgeprint worden.
         */

        int teller =0;

        while (teller < 11) {

            System.out.println("Teller nieuwe waarde: "+teller);
            teller++;

//            Debug: i++ (Post-Increment)
//            Wanneer je de post-increment operator (i++) in de while-conditie gebruikt, gebeurt het volgende:
//            Gebruik, dan Verhoog: De waarde van i wordt eerst gebruikt in de vergelijking (i < 10).
//            Verhoging: Pas nadat de conditie is geëvalueerd, wordt de waarde van i met 1 verhoogd.
//            Output: De System.out.println() print de al verhoogde waarde van i af.
        }

    }


}
