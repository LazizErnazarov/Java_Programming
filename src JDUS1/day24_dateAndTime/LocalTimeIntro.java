package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10, 30);
        System.out.println(starting_time);

        System.out.println("_____________________________________________");

        LocalTime right_now = LocalTime.now();
        System.out.println(right_now);

        System.out.println("_____________________________________________");

        LocalTime Time = LocalTime.of(23, 59, 59);
        System.out.println(Time);

        Time = Time.plusHours(1);
        System.out.println(Time);

        Time = Time.plusMinutes(45);
        System.out.println(Time);
    }
}


