package day34_OOP_AbstractionContinue.AnimalTask;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating fish food");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swimming");
    }
}
