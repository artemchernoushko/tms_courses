package hw_23_09_2020;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int array[] = {1, -4, 12, 16, -3, 5, 8, -9, 0, -5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_ind = 0;
        int min_ind = 0;
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] < 0)
                sum += array[i];
            if (array[i] > max) {
                max = array[i];
                max_ind = i;
            }
            if (array[i] < min) {
                min = array[i];
                min_ind =i;
            }
        }
        for (int i=max_ind+1; i < min_ind; i++) {
            prod *= array[i];
        }
        System.out.println("Sum of negative elements = " + sum);
        System.out.println("Product between the maximum and minimum elements = " + prod);
    }
}
