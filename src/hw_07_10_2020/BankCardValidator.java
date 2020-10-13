package hw_07_10_2020;

import java.util.Date;
import java.util.Scanner;

public class BankCardValidator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card type");
        String type = scanner.nextLine();
        String w = "debit";

        System.out.println("Enter the cardholder's name");
        String name = scanner.nextLine();

        System.out.println("Enter the Cvv code");
        int cvv = scanner.nextInt();
        String str1 = String.valueOf(cvv);

        System.out.println("Enter your card number");
        long number = scanner.nextLong();
        String str = String.valueOf(number);

        System.out.println("Enter the card expiration month");
        int month  = scanner.nextInt();
        System.out.println("Enter the card expiration year");
        int year = scanner.nextInt();


       class ValidateCard {
            public void checkCardNumber(){
                if(str.length() == 16){
                    System.out.println("The card number was entered correctly");
                } else {
                    System.out.println("The card number was entered incorrectly");
                }
            }
            public void checkCardType (){
                if(type.matches(w) ) {
                    System.out.println("The card type was entered correctly");
                } else {
                    System.out.println("The card type was entered incorrectly");
                }
            }
            public void checkCardHolderName (){
                if (name.length() != 0) {
                    System.out.println("The cardholder's name was entered correctly");
                } else {
                    System.out.println("The cardholder's name was entered incorrectly");
                }
            }
           public void checkCvv() {
               if (str1.length() == 3){
                   System.out.println("The Cvv code was entered correctly");
               } else {
                   System.out.println("The Cvv code was entered incorrectly");
               }
           }
            public void checkCardDate() {
                if (month <= 12 & year <= 25) {
                    System.out.println("Date of validity of the card is entered correctly");
                } else {
                    System.out.println("The card validity date was entered incorrectly");
                }
            }
        }

        ValidateCard typ = new ValidateCard();
        typ.checkCardType();
        ValidateCard nam = new ValidateCard();
        nam.checkCardHolderName();
        ValidateCard cv = new ValidateCard();
        cv.checkCvv();
        ValidateCard num = new ValidateCard();
        num.checkCardNumber();
        ValidateCard dat = new ValidateCard();
        dat.checkCardDate();

    }
}