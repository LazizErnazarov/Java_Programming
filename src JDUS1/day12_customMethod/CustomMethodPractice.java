package day12_customMethod;

public class CustomMethodPractice {

    public static void main(String[] args) {

        eligible(21);
        oddEvenZero(9);


    }

    public static void eligible(int age) {

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }

    public static void oddEvenZero(int num) {

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd or Zero");
        }
    }
}


// create a method that can check if a person is eligible to buy alcohol  (age)

// create a method that can check if a number is odd, or even or zero (number)

// create a method that can calculate the grade of the students  (score)
