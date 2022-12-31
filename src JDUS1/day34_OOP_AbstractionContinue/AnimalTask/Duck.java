package day34_OOP_AbstractionContinue.AnimalTask;

public class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating worm");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void swim() {

    }
}