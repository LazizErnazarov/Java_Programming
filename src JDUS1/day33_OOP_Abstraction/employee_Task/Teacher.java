package day33_OOP_Abstraction.employee_Task;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }
}
