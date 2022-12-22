package day31_MethodOverriding.vehicle;

public class AirPlane extends vehicle {

    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly() {
        System.out.println(getBrand() + " " + getModel() + " is flying");
    }
}

/* Create a sub class of Vehicle named AirPlane
        Extra methods:
        fly()

 */
