package hw_28_10_2020.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> key = new HashSet<>();
        ArrayList<String> values = new ArrayList<>();

        map.put(1, "Chernoushko");
        map.put(2, "Artem");
        map.put(3, "Sergeevich");

        System.out.println("Map " + map);

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            key.add(item.getKey());
            values.add(item.getValue());
        }

        System.out.println("Keys " + key);
        System.out.println("Values " + values);
    }
}
