package hw_04_11_2020.Date;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String S;
    private static boolean bool;
    private static final String DATE_PATTERN = "[0-9]{4}/(0[1-9]|1[012])/(0[1-9]|1[0-9]|2[0-9]|3[01]/S^(([0,1][0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]$)";

    public static void main(String[] args) {
        System.out.println("Enter date: ");
        Scanner s = new Scanner(System.in);
        S = s.next();
        bool = validate(S);
        if (bool == true) {
            System.out.println("Date entered correctly");
        } else {
            System.out.println("Date entered incorrectly");
        }
    }

    public static boolean validate(String date) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
