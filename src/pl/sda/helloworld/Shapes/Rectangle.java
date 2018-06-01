package pl.sda.helloworld.Shapes;

public class Rectangle extends Shape {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getPerimiter() {
        return 2*a + 2*b;
    }
}
