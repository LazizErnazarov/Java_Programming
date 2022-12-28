package day34_OOP_AbstractionContinue.CarTask;

public class TestCarObjects {

    public static void main(String[] args) {

        Audi audi = new Audi("Q6", "Black", 2020, 45000);
        Honda honda = new Honda("Odyssey", "Grey", 2014, 16000);
        Tesla tesla = new Tesla("Y", "Silver", 2020, 60000);

        System.out.println(audi);
        System.out.println(honda);
        System.out.println(tesla);

        System.out.println("__________________________");

        audi.start();
        tesla.start();
        honda.start();

        System.out.println("_____________________________");

        audi.autoPark();
        tesla.autoPilot();

    }

}
