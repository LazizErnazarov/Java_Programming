package day09_ScannerClass;

import java.util.Scanner;

public class EligibleOrNotEligible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter his/her age: ");
        int age = input.nextInt();

        String result = "";

        if (age >= 21) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        System.out.println(result);

        input.close();

    }
}
