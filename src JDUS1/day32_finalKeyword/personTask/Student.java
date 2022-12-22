package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Student{

    public String School;
    public String name;

    public Student(String school, String name) {
        setSchool(school);
        setName(name);
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "School='" + School + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
