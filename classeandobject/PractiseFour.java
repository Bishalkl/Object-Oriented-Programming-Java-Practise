package classeandobject;

// Define class for Circle
class Circle{

    // field for data security
    private double radius;
    private double areaCirc;


    // method to calcuate area
    public double areaCricle(double radius){
        areaCirc = Math.PI * Math.pow(radius , 2);
        double roudedNumber = Math.round(areaCirc * 100.0) / 100.0; // this is for to convert long double to only 2 decimal number
        System.out.println("Area of cirlce: "+roudedNumber);
        System.out.println();
        return areaCirc;
    }

    // to get access to private and update radius
    public double getRadius(){
        return radius;
    }
    
    // to get acess to private and update areaCirc
    public double getAreaCirc(){
        return areaCirc;
    }

}


// Define class for Rectangle
class Rectangle{

    // field for data security
    private double width;
    private double height;
    private double areaRect;

    // method to calculate area
    public double areaRectangle(double width, double height){
        areaRect = width * height;
        System.out.println("THe area of rectangle: "+areaRect);
        System.out.println();
        return areaRect;
    }

    //to get access to private and update width
    public double getWidth(){
        return width;
    }

    //to get access to private and update height
    public double getHeight(){
        return height;
    }

        //to get access to private and update areaRect
    public double getAreaRect(){
        return areaRect;
    }
}


// define class for triangle

class Triangle{

    // field for data security
    private double base;
    private double height;
    private double areaTri;

    // method to calculate area
    public double areaTri(double base, double height){
        areaTri = (0.5)* base * height;
        System.out.println("THe area of Triangle: "+areaTri);
        System.out.println();
        return areaTri;
    }

    //to get access to private and update base
    public double getWidth(){
        return base;
    }

    //to get access to private and update height
    public double getHeight(){
        return height;
    }

        //to get access to private and update areaTri
    public double getAreaTri(){
        return areaTri;
    }
}



// this main class for execute program
public class PractiseFour {
    public static void main(String[] args) {

        // this is for circle Shape
        Circle circleOne = new Circle();
        circleOne.areaCricle(24);

        // this is for rectangle shape
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.areaRectangle(24, 12);

        // this is for triangle shape
        Triangle triangleOne = new Triangle();
        triangleOne.areaTri(23, 34);
    }
}
