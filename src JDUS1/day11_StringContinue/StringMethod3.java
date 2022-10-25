package day11_StringContinue;

public class StringMethod3 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //-----------------------

        String str = "           ";

        boolean r2 =str.isEmpty();
        boolean r3 =str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        //---------------------------

        String str1 = "Cydeo";
        String  str2 = new String("Cydeo");

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));

        //---------------------------------

        String st1 = "JAVA";
        String st2 = "java";

        System.out.println(st1.equals(st2));

        System.out.println(st1.equalsIgnoreCase(st2));

    }
}
