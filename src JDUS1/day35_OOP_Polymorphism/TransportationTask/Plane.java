package day35_OOP_Polymorphism.TransportationTask;

public abstract class Plane extends Transportation {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

   public void land(){
       System.out.println("Plane "+getMake()+" "+getModel() +" is landing");
   }


}