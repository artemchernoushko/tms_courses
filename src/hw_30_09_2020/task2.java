package hw_30_09_2020;

public class task2 {
    public static void main(String[] args) {
        int am = 1;

        for (int i = 0; i < 25; i += 3) {
            if (i > 1) {
                am = am * 2;
            }
            System.out.println("Number of amoebas after " + i + " hours =  " + am);
        }
    }
}
