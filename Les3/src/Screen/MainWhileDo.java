package Screen;

import java.util.Scanner;

public class MainWhileDo {
    public static void main(String[] args) {

        int input = 5;
        int max = 5;
        int count = input;
        do {
            System.out.println("Count = "+count);
            count++;
        }while(count < max);

        int count2 = input;
        while(count2 < max) {
            System.out.println("Count2 = "+count2);
            count2++;
        }


        Scanner scanner = new Scanner(System.in);
        String favorieteFruit = "banaan";
        String keuzeFruit;

        do {
            System.out.printf("Wat is je favoriete fruit? ");
            keuzeFruit = scanner.nextLine().toLowerCase().trim();
        }while(!favorieteFruit.equals(keuzeFruit));
        System.out.println("Smakelijk");
    }
}
