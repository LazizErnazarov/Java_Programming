package day38_exceptions;

public class Person {

    private  String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        this.gender = gender;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0||age>150){

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


}
