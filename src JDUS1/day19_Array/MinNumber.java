package day19_Array;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 10, 30};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }


        System.out.println("Min is " + min);


    }
}
