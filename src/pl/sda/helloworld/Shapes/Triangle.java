package pl.sda.helloworld.Shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimiter() {
        return 3 + 2;
    }
}
