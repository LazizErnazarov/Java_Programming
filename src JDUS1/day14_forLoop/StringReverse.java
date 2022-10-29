package day14_forLoop;

public class StringReverse {


    public static void main(String[] args) {

        String str = "Cydeo School";
        //            0123
        //"avaJ"

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }
}
