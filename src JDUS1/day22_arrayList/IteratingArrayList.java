package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);


        System.out.println(numbers);

        System.out.println("___________________");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("________________________");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("_________________________");

        for (Integer each : numbers) {
            System.out.println(each);
        }
    }
}
