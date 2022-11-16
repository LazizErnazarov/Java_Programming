package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10;
        Integer a2 = 10;

        System.out.println("_________________________");

        int b1 = 100;

        double c1 = b1;
        long c2 = b1;

        Integer b2 = b1;   // auto boxing
        // long b3 = (long)b1;
        // double b4=


        char ch = 'A';
        Character ch2 = ch;//auto boxing

        double d1 = 5.5;
        double d2=d1;// auto boxing

        System.out.println("____________________");


        Integer n1= 20;

        int n2 = n1; // unboxing
        // long n3=n1;
        // double n4=n1;


    }

}
