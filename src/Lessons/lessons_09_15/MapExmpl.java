package Lessons.lessons_09_15;

import java.util.HashMap;
import java.util.Map;

public class MapExmpl {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Alex", "25.05.1998");
        myHashMap.put("Sasha", "15.08.1992");
        myHashMap.put("Georg", "30.08.1986");
        System.out.println("-------------------------------------------");
        System.out.println("Map before delete: ");
        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
            System.out.println(i.getKey() + "-" + i.getValue());
        }

        myHashMap.remove("Sasha");
        System.out.println();
        System.out.println("Map after delete: ");
        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
            System.out.println(i.getKey() + "-" + i.getValue());
        }
        System.out.println("-------------------------------------------");
        System.out.println("Value for key Alex - " + myHashMap.get("Alex"));

        System.out.println("-------------------------------------------");

        System.out.println("Do we have Alex? - " + myHashMap.containsKey("Alex"));
        int a = 20;
        int b = 8;
        System.out.println(4 / 0);
    }
}
