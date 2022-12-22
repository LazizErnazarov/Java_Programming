package day31_MethodOverriding;

class A {
    public int a = 100;
}

public class FieldHiding {

    public int a = 300;

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);

    }
}
