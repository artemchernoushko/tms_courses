package hw_14_10_2020.animal;

public abstract class Animal {
    protected String diet;
    protected String family;
    protected String breed;

    public Animal(String diet, String family, String breed) {
        this.diet = diet;
        this.family = family;
        this.breed = breed;
    }

    public String getDiet() {
        return diet;
    }

    public String getFamily() {
        return family;
    }

    public String getBreed() {
        return breed;
    }

    public void info(){

    }

    protected void speak(){
        System.out.println("Speak");

    }

}
