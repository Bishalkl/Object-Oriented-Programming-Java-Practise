package inheritance;


class Shape{

    // method default
    public double calculateArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    // attribute
    double radius;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // method to AreaofCircle
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
public class PractiseTwo {
    public static void main(String[] args) {
        Shape newShape = new Circle(23);
        System.out.println( newShape.calculateArea());

        
    }
}
