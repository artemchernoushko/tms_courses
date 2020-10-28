package hw_28_10_2020.botanist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> plants = new HashMap<>();

        plants.put("Watermelon", "Berry");
        plants.put("Eggplant", "Vegetable");
        plants.put("Garlic", "Vegetable");
        plants.put("Apple", "Fruit");

        AllInfo(plants);
        System.out.println("Enter the tick plant ");
        Info(plants, scanner.next());

    }

    private static void Info(Map plants, String plant) {
        if (plants.get(plant) != null) {
            System.out.println(plant + " " + plants.get(plant));
        } else {
            System.out.println("Error, there is no such plant in this list");
        }
    }

    private static void AllInfo(Map<String, String> plants) {
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + " " + plant.getValue());
        }
    }
}
