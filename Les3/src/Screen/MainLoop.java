package Screen;

import java.util.ArrayList;

public class MainLoop {
    public static void main(String[] args) {


        ArrayList<String> fruit = new ArrayList<>();
            fruit.add("apple");
            fruit.add("orange");
            fruit.add("banana");
            fruit.add("kiwi");

            for(int i = 0; i < fruit.size(); i++){
                System.out.println(i+"e "+fruit.get(i));
            }
        System.out.println("-------------");
            for(int i = 1; i < fruit.size(); i++){
                System.out.println(i+"e "+fruit.get(i));
            }
        System.out.println("-------------");
            for(int i = 0; i < fruit.size(); i++){
                System.out.println(+ (i+1) +"e "+fruit.get(i));
            }
        System.out.println("-------------");
            for (String fruiten : fruit){
                System.out.println("ik eet graag "+fruiten);
            }
    }
}
