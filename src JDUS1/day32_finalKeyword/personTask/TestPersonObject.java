package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);
        person.breath();

        System.out.println("____________________________");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 1, 25), "Accountant", 100000);
        System.out.println(employee);

        employee.breath();

        System.out.println("___________________________");

        Student student = new Student("Cydeo", "Me");
        System.out.println(student);


    }
}
