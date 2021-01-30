package polymorphism;

import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Shape shape = null;
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
       // Circle circle11 = new Circle();
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0 :
                shape = circle;
                break;
            case 1:
                shape = rectangle;
                break;
            case 2:
                shape = triangle;
                break;
        }
        shape.draw();
    }
}
