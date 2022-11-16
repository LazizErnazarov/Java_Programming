package day01_IntroToProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = "";
        int length = word.length();
        int odd = (length - 1) / 2;
        int even = (length - 2) / 2;

        if ((word.length()) % 2 == 0) {
            result = result + word.substring(even, even + 2);
        } else {
            result = result + word.substring(odd, odd + 1);
        }

        System.out.println(result);

    }
}



