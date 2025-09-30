package Screen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MainArrayList {
    public static void main(String[] args) {


    int[] nummers = new int []{1,2,3};
    System.out.println(Arrays.toString(nummers));

    int[] cijfers = new int [4];
    cijfers[0] = 10;
    cijfers[1] = 20;
    cijfers[2] = 30;

    String[] letters = new String[] {"A","B","C","D","E"};

    System.out.println("3e cijfer: "+cijfers[2]);
    System.out.printf("laatste letter: "+ letters[4]);

    //IMMUTABLE list
    List<Integer> immutableNumbers = Arrays.asList(1,2,3,4);
    System.out.println(immutableNumbers);
    //onderstaande lijn werkt niet aangezien immutable
    //immutableNumbers.add(5);


    System.out.println("-------------------");


    String[][] tabelFruits = new String[3][3];
    tabelFruits[0][0] = "Geel";
    tabelFruits[0][1] = "Banaan";
    tabelFruits[0][2] = "Citroen";
    tabelFruits[1][0] = "Groen";
    tabelFruits[1][1] = "Limoen";
    tabelFruits[1][2] = "Avocado";

    System.out.println(Arrays.toString(tabelFruits[0]));
    System.out.println(Arrays.toString(tabelFruits[1]));
    System.out.println("-------------------");

    ArrayList<String> namenList = new ArrayList<>();
    namenList.add("Robin");
    namenList.add("Sam");
    namenList.add("Kurt");
    namenList.add("Kurt");
    namenList.add("Danny");
    namenList.add("Sara");
        System.out.println("1e naam is: "+namenList.get(0));
        System.out.println("1e naam is: "+namenList.getFirst());
        System.out.println("laatste naam is: "+namenList.get(5));
        System.out.println("laatste naam is: "+namenList.get(namenList.size()-1));
        System.out.println("laatste naam is: "+namenList.getLast());
        System.out.println(namenList);

        if (namenList.contains("Robin")) {
            System.out.println("Robin staat in de lijst");
        } else {
            System.out.println("Robin staat niet in de lijst");
        }

    namenList.remove("Robin");
    namenList.remove("Sara");
    namenList.remove("Kurt");
        System.out.println("1e naam is: "+namenList.getFirst());
        System.out.println("laatste naam is: "+namenList.getLast());

        //alternatieve wijze voor else if, kan ook gewoon voor if
        System.out.println(
                namenList.contains("Robin")
                    ?
                    "Robin staat in de lijst"
                    :
                    namenList.contains("Sara")
                        ?
                        "Sara staat in de lijst"
                        :
                        "Sara en Robin staan niet in de lijst");

    //HashSet
    Set<String> uniekeNamen = Set.copyOf(namenList);
        System.out.println(uniekeNamen);

    }




}