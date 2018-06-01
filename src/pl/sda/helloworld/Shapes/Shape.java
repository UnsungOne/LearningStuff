package pl.sda.helloworld.Shapes;

public abstract class Shape {

    abstract double getArea();

    abstract double getPerimiter();

    @Override
    public String toString() {
        return "Shape{" + "Area: " + getArea() + "Perimiter: " + getPerimiter() + "}";
    }


}