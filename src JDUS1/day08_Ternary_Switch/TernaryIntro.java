package day08_Ternary_Switch;

public class TernaryIntro {

    public static void main(String[] args) {

        int score = 59;

        String result = "";

        if (score >= 60) {
            result = "Passed";
        } else {
            result = "Failed";
        }
                System.out.println(result);

        System.out.println("_____________________________");

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);

        System.out.println("----------------------------------------------------");

        int age = 20;

        /*
        String r;
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not eligible";
        }
    */

        String result3 =  (age >= 21) ? "Eligible" : "Not eligible" ;

        System.out.println(result3);


    }
        }



