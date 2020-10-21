package hw_14_10_2020.animal;

public class Mouse extends Animal implements Movement,Ate {
    public Mouse(String diet, String family, String breed) {
        super(diet, family, breed);
    }

    @Override
    public void info() {
        System.out.println("Diet - " + diet + ", Family - " + family + ", Breed - " + breed);
    }

    @Override
    protected void speak() {
        System.out.println("Piiii");
    }

    @Override
    public void movement() {
        System.out.println("The mouse " + move + " away from the cat");
    }

    @Override
    public void ate() {
        System.out.println("Mouse " + ate + " by cat");
    }
}
