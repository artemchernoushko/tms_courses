package hw_30_09_2020;

public class task3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 99; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the numbers from 1 to 99 is " + sum);
    }
}
