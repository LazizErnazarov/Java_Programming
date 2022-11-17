package day23_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(1, numbers);

        System.out.println(list);

        System.out.println("__________________________");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores);

        System.out.println("_______________________");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Vaho", "Ali", "Sarvar"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Laziz", "Qoqon", "Dli"));

        System.out.println(students);

        System.out.println("____________________________");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("_________________________");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeeList);

        boolean hasAlena = employeeList.contains("Alena");
        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena","Gadir"));
        boolean hasMuhtarKuzatAli = employeeList.containsAll(Arrays.asList("Muhtar","Kuzat","Ali"));

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);
        System.out.println("hasMuhtarKuzatAli = " + hasMuhtarKuzatAli);

    }
}
