package polymorphism;

// create superclass
class Shape{

    // field
    public double CalcArea(){
        return 0;
    }

}

// create subclass circle
class Circle extends Shape{

    // field
    private double radius;
    private double areaCircle;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // method override
    public double CalcArea(){
        areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("THe area of circle is "+ areaCircle);
        return areaCircle;
    }
}

// create subclass rectangle
class Rectangle extends Shape{

    // field
    private double length;
    private double width;
    private double areaReactangle;

    // constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double CalcArea(){
        areaReactangle = length * width;
        System.out.println("The area of rectangle is "+areaReactangle);
        return areaReactangle;
    }


}

public class First {
    public static void main(String[] args) {
        
        // test circle
        Shape c1= new Circle(12.45);
        c1.CalcArea();

        // test rectangle
        Shape r1 = new Rectangle(12, 34);
        r1.CalcArea();
    }
}
