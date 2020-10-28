package hw_21_10_2020.exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CarException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the car you want to drive: 1 - BMV, 2 - Mercedes");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Car BMV = new Car("BMV",120,15000);
                BMV.start();
                break;
            case 2:
                Car Mercedes = new Car("Mercedes", 160, 22000);
                Mercedes.start();
                break;
        }
    }
}
