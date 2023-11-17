package week1.interfaceimplementation;

// Interface
interface Shape {
    // Abstract method
    double calculateArea();

    // Default method (with a body)
    default void display() {
        System.out.println("Displaying shape");
    }
}

// Class implementing the interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class implementing the interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Creating objects of classes implementing the interface
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Using common interface methods
        circle.display();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
