package abstraction;

// super abstraction class
abstract class Shape {
    // fields
    protected double length;
    protected double width;
    protected double height;
    protected double radius;

    // constructor
    public Shape(double length, double width, double height, double radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    // method for area
    public double getArea() {
        return 0.0; // Default implementation, to be overridden in subclasses
    }

    // method for perimeter
    public double getPerimeter() {
        return 0.0; // Default implementation, to be overridden in subclasses
    }

    // get methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    // method for getting information of shape
    public void getInfo() {
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);
        System.out.println("Radius is: " + radius);
    }
}

// concrete classes

// for circle
class Circle extends Shape {
    // constructor
    public Circle(double radius) {
        super(0, 0, 0, radius);
    }

    // method for area
    public double getArea() {
        double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle is " + areaCircle);
        return areaCircle;
    }

    // method for perimeter
    public double getPerimeter() {
        double perimeterCircle = 2 * Math.PI * radius;
        System.out.println("The Perimeter of circle is " + perimeterCircle);
        return perimeterCircle;
    }
}

// for rectangle
class Rectangle extends Shape {
    // constructor
    public Rectangle(double length, double width) {
        super(length, width, 0, 0);
    }

    // method for area
    public double getArea() {
        double areaRectangle = length * width;
        System.out.println("The area of rectangle is " + areaRectangle);
        return areaRectangle;
    }

    // method for perimeter
    public double getPerimeter() {
        double perimeterRectangle = 2 * (length + width);
        System.out.println("The Perimeter of rectangle is " + perimeterRectangle);
        return perimeterRectangle;
    }
}

class Triangle extends Shape {
    // constructor
    public Triangle(double length, double width, double height) {
        super(length, width, height, 0);
    }

    // method for area
    public double getArea() {
        double areaTriangle = 0.5 * width * height;
        System.out.println("The area of triangle is " + areaTriangle);
        return areaTriangle;
    }

    // method for perimeter
    public double getPerimeter() {
        double perimeterTriangle = length + width + height;
        System.out.println("The Perimeter of triangle is " + perimeterTriangle);
        return perimeterTriangle;
    }
}

public class One {
    public static void main(String[] args) {
        // Test
        Circle c1 = new Circle(111);
        c1.getArea();

        // Test2
        Rectangle r1 = new Rectangle(12, 23);
        r1.getPerimeter();

        // Test3
        Triangle t1 = new Triangle(12, 23, 34);
        t1.getArea();
    }
}
