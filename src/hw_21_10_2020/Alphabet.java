package hw_21_10_2020;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        String letter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter LETTER");
        letter = scanner.nextLine();

        System.out.println(letter + " = " + Letter.valueOf(letter).getLetterPosition());
    }

    public enum Letter {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
       public int getLetterPosition() {
            return this.ordinal() + 1;
        }
    }
}

