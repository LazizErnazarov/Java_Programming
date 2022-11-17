package day23_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);

        System.out.println("_____________________________");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Orange", "Eggs", "Orange", "Tomato", "Salt", "Milk","Tomato", "Salt", "Milk"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("_______________________________");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        Collections.swap(students,2,1);

        System.out.println(students);


    }
}
