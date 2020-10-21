package hw_14_10_2020.animal;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(" Omnivorous"," Cat", " The british");
        Dog dog = new Dog(" Carnivorous", " of dogs", " Bulldog");
        Mouse mouse = new Mouse(" Herbivorous", " of mice", " Field mouse");

        System.out.println("Information about the cat");
        printAnimalInfo(cat);
        System.out.println();
        System.out.println("Information about the dog");
        printAnimalInfo(dog);
        System.out.println();
        System.out.println("Information about mouse");
        printAnimalInfo(mouse);
        System.out.println();

        animalVoice(cat);
        mouse.movement();
        cat.movement();
        animalVoice(dog);
        dog.movement();
        animalVoice(mouse);
        cat.ate();
        animalVoice(cat);
        dog.ate();
        animalVoice(dog);
        
    }

    public static void printAnimalInfo(Animal animal) {
        animal.info();
    }

    public static void animalVoice(Animal animal) {
        animal.speak();
    }
}
