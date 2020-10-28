package hw_28_10_2020.motor_show;

public class Auto {
    private String brand;
    private String model;
    private int price;
    private int year;

    public Auto(String brand, String model, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
