package hw_07_10_2020;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private static String typeproc;
    private static int ram;
    private static int disk;

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("To start, press 0 or 1");
        on();
        System.out.println("");
        System.out.println("Computer turned on successfully");
        computerInfo();
        System.out.println("");
        System.out.println("To turn it off, press 0 or 1");
        off();
    }

    Computer() {
        typeproc = "Intel core i7";
        ram = 8;
        disk = 1;
    }

    public static String getTypeproc() {
        return typeproc;
    }

    public static int getRAM() {
        return ram;
    }

    public static int getDisk() {
        return disk;
    }

    public static void computerInfo() {
        System.out.println("Processor type : " + getTypeproc());
        System.out.println("Amount of RAM : " + getRAM()+ " Gb");
        System.out.println("Hard disk space : " + getDisk() + " TB");

    }

    public static void on() {
        Random random = new Random();
        int k = (int) (Math.random() * (1 - 0 + 1) + 0);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == k) {
            System.out.println("Start");
        } else {
            System.out.println("The failure occurred at startup");
            System.out.println("Press 0 to restart, and 1 to exit");
            int a = scanner.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Your computer burned down");
                    break;
                case 1:
                    System.out.println("");
                    break;
            }
            System.exit(0);
        }
    }

    public static void off() {
        Random random = new Random();
        int k = (int) (Math.random() * (1 - 0 + 1) + 0);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == k) {
            System.out.println("Shutdown");
        } else {
            System.out.println("Error when shutting down the computer");
            System.out.println("Press 0 to restart, and 1 to exit");
            int a = scanner.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Your computer burned down");
                    break;
                case 1:
                    System.out.println("");
                    break;
            }
            System.exit(0);
        }

    }
}
