package hw_23_09_2020;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array");
        n = sc.nextInt();
        int array[][] = new int[n][n];

        System.out.println("Enter of elements");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        System.out.print(Arrays.deepToString(array));
    }

}
