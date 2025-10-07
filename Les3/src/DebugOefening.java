public class DebugOefening {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // LIJN 8: Methode-aanroep
        int resultaat = berekenSom(a, b);

        System.out.println("Eindresultaat: " + resultaat); // LIJN 11
    }

    // De methode die we gaan 'Step Into'
    public static int berekenSom(int x, int y) {
        // LIJN 15
        int som = x + y;
        return som;
    }
}