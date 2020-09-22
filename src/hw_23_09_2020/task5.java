package hw_23_09_2020;

import java.util.Arrays;

public class task5 {

    public static void main(String[] args) {
        int[] array = {1, 6, -4, 8, 12, 0, -1, 5, 11, 2};

        System.out.println("Not Sorted");
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted");

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
