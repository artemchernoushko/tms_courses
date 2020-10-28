package hw_28_10_2020.motor_show;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorShow {
    ArrayList<Auto> autos;

    public MotorShow() {
        this.autos = new ArrayList<>();
    }

    public ArrayList<Auto> getAuto() {
        return this.autos;
    }

    public Auto getAuto(int index) {
        return this.autos.get(index);
    }

    public void addAuto(Auto auto) {
        this.autos.add(auto);
    }

    public void removeAuto(int index) {
        this.autos.remove(index);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static MotorShow motorShow;

    @Override
    public String toString() {
        return "MotorShow{" +
                "autos=" + autos +
                '}';
    }

    public static void main(String[] args) {
        motorShow = new MotorShow();
        motorShow.addAuto(new Auto("Lada", "Kalina", 8000, 2019));
        motorShow.addAuto(new Auto("Geely", "Cool Ray", 19000, 2020));
        motorShow.addAuto(new Auto("Reno", "Logan", 7000, 2018));
        motorShow.addAuto(new Auto("Porshe", "Cayenne", 52000, 2020));
        input();
    }

    private static void input() {
        System.out.println("Login. 1 - Salon employee. 2 - Customer. 3 - Exit");
        try {
            switch (scanner.nextInt()) {
                case (1):
                    Worker worker = new Worker();
                    worker.menuWorker(motorShow);
                    break;
                case (2):
                    Client client = new Client();
                    client.menuCLient(motorShow);
                    break;
                case (3):
                    System.exit(0);
                default:
                    System.out.println("Error, choose one of the three options");
                    input();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
