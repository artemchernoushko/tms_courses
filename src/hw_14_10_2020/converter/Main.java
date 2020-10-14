package hw_14_10_2020.converter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter degrees Celsius");
        CelsiusConverter celsius = new CelsiusConverter();
        celsius.convert();
        FahrenheitConverter farenheit = new FahrenheitConverter();
        farenheit.convert();
        KelvinConverter kelvin = new KelvinConverter();
        kelvin.convert();
    }
}
