package hw_14_10_2020.converter;

public class CelsiusConverter  implements Converter{
    @Override
    public void convert() {
        System.out.println("the temperature in Celsius = " + value);
    }
}
