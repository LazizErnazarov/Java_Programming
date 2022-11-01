package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter you first number");
        double num1 = inp.nextDouble();

        System.out.println("Enter your second number");
        double num2 = inp.nextDouble();

        System.out.println("Enter a math operator");
        char operator = inp.next().charAt(0);

        while (!(operator == '+' || operator == '*' || operator =='/')){
            System.err.println("Invalid Operator! Please re=enter the math operator");
            operator = inp.next().charAt(0);

        }

        if(operator=='+'){
            System.out.println(num1+num2);
        } else if (operator=='-') {
            System.out.println(num1-num2);
        } else if (operator =='*') {
            System.out.println(num1*num2);
        }else{
            System.out.println(num1/num2);
        }
    }
}

