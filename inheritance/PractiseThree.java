package inheritance;



interface Shape{

    public double calcuArea();
}

interface Color{
    void setColor(String color);
}


class Circle implements Shape, Color{
    private double radius;
    private String color;
    private double AreaCirc;

    public Circle( double radius, String color){
        this.radius = radius;
        this.color = color;
        this.AreaCirc = Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }

    public double calcuArea(){
        return AreaCirc;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void displayInfo(){
        System.out.println(calcuArea());
        System.out.println(color);
    }
}
public class PractiseThree {
    public static void main(String[] args) {
        Circle s1 = new Circle(23.4, "red");
        s1.displayInfo();
    }
}
