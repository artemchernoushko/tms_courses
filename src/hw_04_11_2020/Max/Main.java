package hw_04_11_2020.Max;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max = file.read();
        while (file.available() > 0) {
            int n = file.read();
            if (n > max) {
                max = n;
            }
        }
        file.close();
        System.out.println(max);
    }
}
