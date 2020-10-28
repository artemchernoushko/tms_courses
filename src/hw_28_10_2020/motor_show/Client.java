package hw_28_10_2020.motor_show;

import java.util.Scanner;
import java.util.ArrayList;

public class Client extends User{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Auto> buyAuto;

    public Client() {
        this.buyAuto = new ArrayList<>();
    }

    public void buyAuto(MotorShow motorShow, int index) {
        this.buyAuto.add(motorShow.getAuto(index));
        motorShow.removeAuto(index);
        System.out.println("Congratulations on your purchase");
    }

    public ArrayList<Auto> getBuyAuto() {
        return buyAuto;
    }

    public void menuCLient(MotorShow motorShow) {
        System.out.println("1 - Buy auto. 2 - List of cars. 3 - Get information about the car. 4 - Exit");
        try {
            switch (scanner.nextInt()) {
                case (1):
                    System.out.println("Choose a car to buy: ");
                    buyAuto(motorShow, scanner.nextInt());
                    menuCLient(motorShow);
                case (2):
                    InfoAllAuto(motorShow);
                    menuCLient(motorShow);
                case (3):
                    System.out.println("Enter the number of the car you are interested in: ");
                    InfoAuto(motorShow, scanner.nextInt());
                    menuCLient(motorShow);
                case (4):
                    System.exit(0);
                default:
                    System.out.println("Choose from 1 to 4");
                    menuCLient(motorShow);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid parameters entered");
            scanner.next();
            menuCLient(motorShow);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "scanner=" + scanner +
                ", buyAuto=" + buyAuto +
                '}';
    }
}
