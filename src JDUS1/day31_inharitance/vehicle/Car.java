package day31_inharitance.vehicle;

public class Car extends vehicle {

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive() {
        System.out.println("Driving " + getBrand() + " " + getModel());
    }
}
/*
Create a sub class of Vehicle named Car
			Extra methods:
				drive()
 */