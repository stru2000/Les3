package Screen;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String naam = sc.nextLine().toLowerCase();
        switch (naam) {
            case "mark":
                System.out.println("drinkt graag koffie");
                break;
            case "sanne":
                System.out.println("drinkt graag water");
                break;
            case "robin":
                System.out.println("drinkt graag melk");
                break;
            default:
                System.out.println("ik ken je niet");
        }

        String answer = switch(naam){
            case "Mark" -> "koffie";
            case "Sanne" -> "water";
            case "Robin" -> "melk";
            default -> "niks";
        };
        System.out.println(answer);



        enum Days {MA,DI,WO,DO,VR,ZA,ZO};
        Days day = Days.MA;
        String litDay = switch(day){
            case MA -> "maandag";
            case DI -> "dinsdag";
            case WO -> "woensdag";
            case DO -> "donderdag";
            case VR -> "vrijdag";
            case ZA -> "zaterdag";
            case ZO -> "zondag";
            default -> "niks";
        };
        System.out.println(litDay);

    }
}
