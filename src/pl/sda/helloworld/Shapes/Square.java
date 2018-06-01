package pl.sda.helloworld.Shapes;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public double getArea() {
        return 4*a;
    }

    @Override
    public double getPerimiter() {
        return 2*a;
    }
}
