package day11_StringContinue;

import java.util.Locale;

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
        
        
        //-------------------------------------
        
        String students = "Hasan Naran Sumeye Natalia";
        
        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is Java";

        boolean hasJava = sentence.toUpperCase().contains("JAVA");

        System.out.println("hasJava = " + hasJava);
        
        //------------------------------------

        String name = "Micheal";

        boolean l =  name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);


        boolean t = url.endsWith(".com");

        System.out.println(t);

        //------------------------------------------------

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);




    }
}
