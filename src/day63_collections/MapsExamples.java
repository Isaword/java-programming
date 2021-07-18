package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        // id, names
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(100, "Maxim");
        map.put(101, "Maxim"); // key is unique, values can be duplicate
        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get("James"));
        System.out.println(map.get(50));

        map.remove(1);
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map);

        System.out.println(map.remove(1));
        System.out.println(map);
        map.remove("Daria");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Daria"));

        for ( Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));

            if (map.get(key).equals("Daria")) {
                System.out.println("this is our key " + key);
            }
        }
    }
}
