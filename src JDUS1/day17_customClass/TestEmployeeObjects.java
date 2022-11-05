package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Laziz",39,'M',"Java Developer",120000,"A707");

        Employee employee2 = new Employee();
        employee2.setInfo("Vaho",38,'M',"Back-end Developer",110000,"A708");

        Employee employee3 = new Employee();
        employee3.setInfo("Dj",37,'M',"Front-end Developer",100000,"A707");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }
}
