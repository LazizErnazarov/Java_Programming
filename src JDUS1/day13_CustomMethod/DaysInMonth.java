package day13_CustomMethod;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        System.out.println("Enter Month:");
        int month = new Scanner(System.in).nextInt();

        if (month < 1 || month > 12) { // if the month is invalid
            System.out.println("Invalid number");
            return; // terminate the main method

        }

        switch (month) {

            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("31 days");
        }
    }
}