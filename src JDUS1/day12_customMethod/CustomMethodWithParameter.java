package day12_customMethod;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(100);

        System.out.println("--------------------------");

        oddOrEven(9);

    }


    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }



}
