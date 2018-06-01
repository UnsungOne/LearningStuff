package pl.sda.helloworld.Shapes;

public class Shapes_Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Rectangle(2, 3),
                new Circle(8),
                new Square(9),
                new Triangle(2, 1)};

        System.out.println("----------------AREA--------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "perimeter: " + shape.getPerimiter());

        }

        System.out.println("-------------------PERIMITER--------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " area: " + shape.getArea());

        }

    }
}