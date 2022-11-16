package day22_arrayList;

public class wrapperClassMethods {


    public static void main(String[] args) {


        String str = "20";


        int num = Integer.parseInt(str);

        System.out.println(num + 1);


        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("__________________________");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);

        boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("_____________________");
        
        char ch = 'a';
        
        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);


    }
}