package hw_14_10_2020.converter;

public class KelvinConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("the temperature in Kelvin = " + (value + 273.15));
    }
}
