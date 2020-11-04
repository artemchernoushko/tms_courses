package hw_04_11_2020.Ip;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String S;
    private static boolean bool;
    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        System.out.println("Enter ip adress: ");
        Scanner s = new Scanner(System.in);
        S = s.next();
        bool = validate(S);
        if (bool == true) {
            System.out.println("Ip address entered correctly");
        } else {
            System.out.println("The Ip address was entered incorrectly");
        }
    }

    public static boolean validate(String ip) {
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
