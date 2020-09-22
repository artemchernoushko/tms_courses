package hw_23_09_2020;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side a: ");
        int a = in.nextInt();
        System.out.println("Enter a side b: ");
        int b = in.nextInt();
        System.out.println("Enter the radius r: ");
        int r = in.nextInt();

        if (r >= (Math.sqrt((a * a) + (b * b))) / 2) {
            System.out.println("The hole is closed");
        } else {
            System.out.println("The hole not closed");
        }
    }
}
