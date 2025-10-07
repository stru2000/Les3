public class DebugOefening {
    public static void main(String[] args) {
        int getalA = 10;
        int getalB = 3;
        double resultaat = getalA / getalB + 0.1; // Lijn 6

        // Bepaal de logische vlag
        boolean vlag = (getalA > 5) || (getalA-- < 10); // Lijn 9

        System.out.println("Resultaat: " + (resultaat * 10)); // Lijn 11
        System.out.println("Vlag: " + vlag);
        System.out.println("A: " + getalA);
    }
}