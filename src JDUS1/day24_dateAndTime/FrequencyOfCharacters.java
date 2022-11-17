package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "aabbbcccc";

        String res = "";

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!res.contains(each)) {
                res += each + frequency;
            }
        }

        System.out.println(res);

    }


}
