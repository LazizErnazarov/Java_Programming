package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObject {

    public static void main(String[] args) {


        Audi audi = new Audi("Q6", "Black", 2020, 32000);
        BMW bmw = new BMW("325XI", "Silver", 2003, 2500);
        Honda honda = new Honda("Odyssey", "Grey", 2014, 16000);
        Tesla tesla = new Tesla("Model Y", "White", 2021, 55000);
        Toyota toyota = new Toyota("Camry", "Grey", 2007, 7000);

        System.out.println(audi + "\n" + bmw + "\n" + honda + "\n" + tesla + "\n" + toyota);

        System.out.println("____________________________________________");
        audi.start();
        bmw.start();
        honda.start();
        tesla.start();
        toyota.start();

        System.out.println("____________________________________________");
       // tesla.setPrice(30000);
        //tesla.setModel("Model Y");

        System.out.println(tesla);

    }
}
