package day04_concatenaition;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Laziz Ern";
        String buildingNumber = "304";
        String streetName = "Douglas Pike";
        String city = "Smithfield";
        String state = "RI";
        String zipCode = "02917";

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + ", " + state +" "+zipCode);

        System.out.println("__________________________________");

        System.out.println("Your Shipping address is:\n\t" + name + "\n\t" + buildingNumber + " " + streetName + "\n\t" + city + "," + state + "" + zipCode);



    }
}
/*
Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger 13621A
Legacy Circle Fairfax, VA 22030
 */