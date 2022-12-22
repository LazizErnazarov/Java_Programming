package day31_MethodOverriding.vehicle;

public class Bike extends vehicle {


    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride() {
        System.out.println("Ride" + getBrand() + " " + getModel());
    }
}
