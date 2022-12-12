package day31_inharitance.vehicle;

public class Boat extends vehicle {
    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail() {
        System.out.println(getBrand() + " " + getModel() + " is sailing");
    }
}
