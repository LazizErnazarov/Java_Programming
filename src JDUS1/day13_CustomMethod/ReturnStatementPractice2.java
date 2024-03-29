package day13_CustomMethod;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        System.out.println("Enter the day of the week:");

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7) {
            System.err.println("Invalid number: " + number);
            return;// exit the main method
        }
        System.out.println((number == 1) ? "Monday"
                : (number == 2) ? "Tuesday"
                : (number == 3) ? "Wednesday"
                : (number == 4) ? "Thursday"
                : (number == 5) ? "Friday"
                : (number == 6) ? "Saturday"
                : "Sunday");

    }

}
