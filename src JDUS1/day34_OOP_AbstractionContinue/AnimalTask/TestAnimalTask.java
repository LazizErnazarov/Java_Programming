package day34_OOP_AbstractionContinue.AnimalTask;

import javax.xml.transform.sax.SAXSource;

public class TestAnimalTask {

    public static void main(String[] args) {

        Cat cat = new Cat("Tutci", "Percit", 'F', 2, "Small", "Grey");
        Dog dog = new Dog("Max", "Shaperd", 'M', 4, "Big", "Brown");
        Dolphin dolphin = new Dolphin("Lucy", "Spinner", 'F', 3, "Medium", "Blue");
        Duck duck = new Duck("Moly","Mallard",'F',2,"Small","Yellow");

        System.out.println("_____________________________________________________________");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(dolphin);
        System.out.println(duck);

        System.out.println("_____________________________________________________________");

        duck.fly();
        duck.eat();
        dolphin.swim();


    }
}
