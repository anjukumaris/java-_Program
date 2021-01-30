package abtractclass;

public class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    public double area() {

        return 3.14d * radius * radius;
    }

    @Override
    public String toString() {

        return "Circle color is "+ super.color + " and area is " + area();
    }
}
