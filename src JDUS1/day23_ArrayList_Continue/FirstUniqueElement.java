package day23_ArrayList_Continue;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);

        System.out.println(list);

        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);
                break; // exiting the loop in order to return the first unique element only
            }
        }

    }
}

/*
Write a program that can return the first unique element from arrayList
 */