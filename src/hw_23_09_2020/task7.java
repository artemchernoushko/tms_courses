package hw_23_09_2020;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    static Random random = new Random();

    public static void main(String[] args) {
        int max = 10;
        int min = -10;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        int array[][] = new int[n][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(max - min) + max];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max - min) + min;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

