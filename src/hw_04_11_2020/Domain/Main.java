package hw_04_11_2020.Domain;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String S;
    private static boolean bool;
    private static final String DOMAIN_PATTERN = "^(https?://)([0-9A-Za-z]+.)([A-Za-z]+)([/?&]|$)";

    public static void main(String[] args) {
        System.out.println("Enter domain: ");
        Scanner s = new Scanner(System.in);
        S = s.next();
        bool = validate(S);
        if (bool == true) {
            System.out.println("Domain entered correctly");
        } else {
            System.out.println("Domain entered incorrectly");
        }
    }

    public static boolean validate(String dom) {
        Pattern pattern = Pattern.compile(DOMAIN_PATTERN);
        Matcher matcher = pattern.matcher(dom);
        return matcher.matches();
    }
}


