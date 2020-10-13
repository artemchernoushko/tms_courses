package hw_07_10_2020;

import java.util.Scanner;

public class Calculator {
    private int operand;
    private int operand1;

    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        operand = a;
        operand1 = b;
    }



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Multiply();
        System.out.println();
        calculator.TheSum();
        System.out.println();
        calculator.Difference();

    }

    public int getOperand() {
        return operand;
    }

    public int getOperand1() {
        return operand1;
    }


    public void Multiply() {
        int prod = getOperand() * getOperand1();
        System.out.println("Multiply = " + prod);
    }

    public void TheSum() {
        int sum = getOperand() + getOperand1();
        System.out.println("The sum = " + sum);
    }

    public void Difference() {
        int dif = getOperand() - getOperand1();
        System.out.println("Difference = " + dif);
    }
}

