package day23_ArrayList_Continue;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        System.out.println("_______________________");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towel");
        groceriesList.add("Apples");
        groceriesList.add("Oil");

        System.out.println(groceriesList);

        groceriesList.set(2, "Orange");

        System.out.println(groceriesList);

        System.out.println("______________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("________________________");

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        ArrayList<String> names = new ArrayList<>();

        names.add("Vaho");
        names.add("Allan");
        names.add("Ali");
        names.add("Sarvar");
        names.add("Ahmed");

        System.out.println(names.indexOf("Vaho"));
        System.out.println(names.lastIndexOf("Allan"));

        System.out.println(names.lastIndexOf("Ahmed"));



    }
}
