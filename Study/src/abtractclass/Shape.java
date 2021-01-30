package abtractclass;

public abstract class Shape {
    protected String color;

    // abstract class can have constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
    // these are abstract methods
    protected abstract double area();
    public abstract String toString();
}
