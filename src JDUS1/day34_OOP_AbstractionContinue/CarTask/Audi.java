package day34_OOP_AbstractionContinue.CarTask;

public class Audi extends Car {

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Press to start button to start " + getMake() + " " + getModel());
    }

    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto park feature");
    }


}
