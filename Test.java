abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method (with implementation)
    public void printDetails() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the abstract method from Shape
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override // Optional annotation for clarity
    public void printDetails() {
        System.out.println("This is a circle with radius: " + radius);
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Overriding the abstract method from Shape
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override // Optional annotation for clarity
    public void printDetails() {
        System.out.println("This is a square with side length: " + sideLength);
    }
}

public class Test {
    public static void main(String[] args) {
        // You cannot create an object of the abstract class Shape
        // Shape shape = new Shape(); // This will cause an error

        Circle circle = new Circle(5);
        Square square = new Square(3);

        System.out.println("Circle area: " + circle.calculateArea());
        circle.printDetails();

        System.out.println("Square area: " + square.calculateArea());
        square.printDetails();
    }
}
