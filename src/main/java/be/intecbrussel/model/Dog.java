package be.intecbrussel.model;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pet(){
        System.out.println("Doggo is pet, doggo is happy.");
    }
}
