package polymorphism;

import java.util.ArrayList;
import java.util.List;

// Create a superclass
class Shape {
    public double calcArea() {
        return 0.0;
    }
}

// Subclass for Circle
class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    protected double height;
    protected double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }
}

public class Five {
    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calcArea();
        }

        return totalArea;
    }

    public static void main(String[] args) {
        // Create a list of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(12, 34));
        shapes.add(new Triangle(12, 34));

        // Calculate the total area using polymorphism
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }
}
