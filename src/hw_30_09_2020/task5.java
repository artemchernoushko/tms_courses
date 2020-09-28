package hw_30_09_2020;

import java.util.Scanner;

public class task5 {
    static String simple(int n, int i) {
        if (n < 2) {
            return "Is number " + n + " simple - NO";
        } else if (n == 2) {
            return "Is number " + n + " simple - YES";
        } else if (n % i == 0) {
            return "Is number " + n + " simple - NO";
        } else if (i < n / 2) {
          return simple(n, i +1);
        } else {
            return "Is number " + n + " simple - YES";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        System.out.printf(simple(n, 2));
    }
}

