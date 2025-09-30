package Screen;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {


        HashMap<String, String> engelsNederlands = new HashMap<>();
        engelsNederlands.put("house", "huis");
        engelsNederlands.put("animal", "dier");
        engelsNederlands.put("banana", "banaan");
        System.out.println(engelsNederlands);
        engelsNederlands.put("house", "muziek");

        System.out.println(engelsNederlands);
        System.out.println("a house is a "+engelsNederlands.get("house"));
    }




}
