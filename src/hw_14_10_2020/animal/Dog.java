package hw_14_10_2020.animal;

public class Dog extends Animal implements Movement, Ate {
    public Dog(String diet, String family, String breed) {
        super(diet, family, breed);
    }

    @Override
    public void info() {
        System.out.println("Diet - " + diet + ", Family - " + family + ", Breed - " + breed);
    }

    @Override
    protected void speak() {
        System.out.println("Gav");
    }

    @Override
    public void movement() {
        System.out.println("The dog " + move + " after the cat");
    }

    @Override
    public void ate() {
        System.out.println("The dog " + ate + " the cat");
    }
}
