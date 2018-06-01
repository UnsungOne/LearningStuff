package pl.sda.helloworld.Shapes;

public class Circle extends Shape {

    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimiter() {
        return 2 * Math.PI * radius;
    }
}
