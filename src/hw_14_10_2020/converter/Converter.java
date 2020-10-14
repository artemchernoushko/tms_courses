package hw_14_10_2020.converter;

import java.util.Scanner;

public interface Converter {
    public void convert();
    Scanner scanner = new Scanner(System.in);
    double value = scanner.nextDouble();
}
