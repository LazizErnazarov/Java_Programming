package day31_inharitance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {


        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("_____________________");

        Circle circle = new Circle(3.5);
        System.out.println(circle);
    }
}
