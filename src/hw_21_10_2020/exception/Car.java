package hw_21_10_2020.exception;

public class Car {

    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarException {
        int n;
        n = (int) (Math.random() * 20);

        if(n % 2 == 0) {
            throw new CarException("Even number - The car didn't start");
        }
        else System.out.println(brand + " The car started");
        }
    }

