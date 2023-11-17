package week1.abstractImplementation;

// Abstract class
abstract class Shape {
    public static double radius = 3.14;
    // Concrete method
    public void display() {
        System.out.println("Displaying shape");
    }


    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();
}

// Subclass implementing the abstract class
class Circle extends Shape {

    public Circle() {
        super();
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass implementing the abstract class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(4, 6);

        // Using common abstract class methods

        System.out.println(circle.calculateArea());
        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
