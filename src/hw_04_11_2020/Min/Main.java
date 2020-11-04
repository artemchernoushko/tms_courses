package hw_04_11_2020.Min;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int min = file.read();
        while (file.available() > 0) {
            int n = file.read();
            if (n < min) {
                min = n;
            }
        }
        file.close();
        System.out.println(min);
    }
}
