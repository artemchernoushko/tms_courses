package hw_14_10_2020.animal;

public class Cat extends Animal implements Movement, Eaten, Ate {

    public Cat(String diet, String family, String breed) {
        super(diet, family, breed);
    }

    @Override
    public void info() {
        System.out.println("Diet - " + diet + ", Family - " + family + ", Breed - " + breed);
    }

    @Override
    protected void speak() {
        System.out.println("Meow");
    }

    @Override
    public void movement() {
        System.out.println("The cat " + move + " after the mouse");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + eat + " by dog");
    }

    @Override
    public void ate() {
        System.out.println("Cat " + ate + " Mouse");
    }
}
