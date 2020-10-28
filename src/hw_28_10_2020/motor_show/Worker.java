package hw_28_10_2020.motor_show;

import java.util.Scanner;

public class Worker extends User {
    Scanner scanner = new Scanner(System.in);

    private void addAuto(MotorShow motorShow, Auto auto) {
        motorShow.addAuto(auto);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "scanner=" + scanner +
                '}';
    }

    public void menuWorker(MotorShow motorShow) {
        System.out.println("1 - Add a car. 2 - List of cars. 3 - Get information about the car. 4 - Exit");
        try {
            switch (scanner.nextInt()) {
                case (1):
                    String brand;
                    String model;
                    int price;
                    int year;
                    System.out.println("Enter the car brand: ");
                    brand = scanner.next();
                    System.out.println("Enter the car model: ");
                    model = scanner.next();
                    System.out.println("Enter the cost of the car: ");
                    try {
                        price = scanner.nextInt();
                    } catch (java.lang.NumberFormatException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Error! Invalid price format");
                        price = 0;
                    }
                    System.out.println("Enter the vehicle year: ");
                    year = scanner.nextInt();

                    addAuto(motorShow, new Auto(brand, model, price, year));
                    System.out.println("Car added");
                    menuWorker(motorShow);
                case (2):
                    InfoAllAuto(motorShow);
                    menuWorker(motorShow);
                case (3):
                    System.out.println("Enter the number of the car you are interested in: ");
                    InfoAuto(motorShow, scanner.nextInt());
                    menuWorker(motorShow);
                case (4):
                    System.exit(0);
                default:
                    System.out.println("Choose from 1 to 4");
                    menuWorker(motorShow);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid parameters entered");
            scanner.next();
            menuWorker(motorShow);
        }

    }
}
