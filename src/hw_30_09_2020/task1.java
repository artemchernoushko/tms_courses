package hw_30_09_2020;

public class task1 {
    public static void main(String[] args) {
        float sum = 0;
        float dist = 10;

        for (int i = 1; i < 8; i++) {
            if (i >= 2) {
                dist = dist + (dist / 10);
            }
            sum += dist;
            System.out.println("On day " + i + " the athlete ran " + dist + " km");
        }
        System.out.println("The total distance for 7 days is = " + sum + " km");
    }
}
