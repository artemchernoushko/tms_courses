package hw_14_10_2020.converter;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("the temperature in Farenheit = " + ((value * 1.8) + 32));
    }
}
