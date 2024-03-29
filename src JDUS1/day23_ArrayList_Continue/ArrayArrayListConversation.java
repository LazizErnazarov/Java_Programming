package day23_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversation {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("_____________________");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
        String[] language = list1.toArray(new String[0]);

        System.out.println(Arrays.toString(language));

        System.out.println("__________________________");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));

    }
}
