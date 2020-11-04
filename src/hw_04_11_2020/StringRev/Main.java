package hw_04_11_2020.StringRev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new FileReader("txt2.txt"));
        String s = str.readLine();
        System.out.println(s);
        String arr[] = s.split(" ");
        StringBuilder st = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            st.append(arr[i]);
            st.append(" ");
        }
        st.append(arr[0]);
        String rev = st.toString();
        System.out.println(rev);
    }
}

