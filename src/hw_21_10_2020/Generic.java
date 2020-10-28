package hw_21_10_2020;

import java.util.Scanner;

public class Generic<E> {
    E[] array;

    public Generic (E[] array){
        this.array = array;
    }

    public <E> E Index(int index) {
        return (E) this.array[index];
    }


    public static void main(String[] args) {
        Generic <String> str = new Generic<>(new String[]{"Chernoushko","Artem","Serggevich"});
        Generic <Integer> Int = new Generic<>(new Integer[]{06, 01, 1994});

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter index String and Integer: ");
         int Strindex = scanner.nextInt();
         int Intindex = scanner.nextInt();

        System.out.println(str.<String>Index(Strindex));
        System.out.println(Int.<Integer>Index(Intindex));

    }
}
