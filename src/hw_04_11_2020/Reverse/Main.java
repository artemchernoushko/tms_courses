package hw_04_11_2020.Reverse;

import java.io.*;

public class Main {
    public static String revers(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("txt1.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = revers(s);
        file.write(s);
        file.close();
    }
}
