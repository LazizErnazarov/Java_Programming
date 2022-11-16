package day23_ArrayList_Continue;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vaho");
        names.add("Alla");
        names.add("Ali");
        names.add("Sarvar");
        names.add("Ahmed");
        names.add("Vaho");
        names.add("Allan");
        names.add("Ali");
        names.add("Savar");
        names.add("Ahmed");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)) {
                System.out.println(each);
                break;
            }
        }
    }
}
