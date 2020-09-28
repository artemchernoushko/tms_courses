package hw_30_09_2020;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class task4 {
    static Random random = new Random();

    public static void main(String[] args) {
        int n;
        int[] array2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        int array[] = new int[n];

        if (n <= 3) {
            System.out.println("You entered an invalid number");
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array));
            array2 = even(array);
            System.out.println(Arrays.toString(array2));
        }
    }

    public static int[] even(int[] array1) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0){
                count++;
            }
        }

        int[] returnArr = new int[count];

        for (int i =0, j = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                returnArr[j++] = array1[i];
            }
        }
        return returnArr;
    }
}
