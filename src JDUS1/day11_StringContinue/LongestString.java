package day11_StringContinue;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first text");
        String first = input.nextLine();
        System.out.println("Enter second text");
        String second = input.nextLine();

        input.close();

        if( first.length() > second.length()){
            System.out.println("first string is the longest");
        }else if(first.length() < second.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("Equal");
        }
    }
}