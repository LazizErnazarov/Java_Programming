package day09_ScannerClass;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("it is an even number");
            } else {
                System.out.println("it is an odd number");
            }
        }
    }
}