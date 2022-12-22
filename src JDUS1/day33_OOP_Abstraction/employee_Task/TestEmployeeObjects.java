package day33_OOP_Abstraction.employee_Task;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        // Employee employee = new Employee("Laziz",40,'M',"A1","Developer",125000);
        // We can not creat objects from an abstract class,Object Must be created from a concrete class

        Teacher teacher = new Teacher("James", 45, 'M', "A2", "Math teacher", 75000);

        Developer developer = new Developer("Laziz", 40, 'M', "A7", "Developer", 125000, "Java");

        Driver driver = new Driver("Daniel", 35, 'M', "A3", "Taxi driver", 65000);

        Tester tester = new Tester("Emily", 28, 'F', "A8", "SDET", 85000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("______________________");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();

    }

}
