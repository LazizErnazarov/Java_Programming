package day23_ArrayList_Continue;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vaho");
        names.add("Allan");
        names.add("Ali");
        names.add("Sarvar");
        names.add("Ahmed");
        names.add("Allan");
        names.add("Ahmed");
        names.add("Vaho");
        names.add("Allan");
        names.add("Alikhon");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }
        names = nonDup;
        System.out.println(names);
    }
}
