package day11_StringContinue;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String correctUsername = "Cydeo", // literal
                correctPassword = "WoodenSpoon"; // literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine();  // new

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("You are now logged in");
        } else {
            System.err.println("Incorrect username or password. Please try again");
        }
    }
}