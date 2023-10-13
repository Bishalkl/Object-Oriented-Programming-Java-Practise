package encapsulation;

class Rectangle{
    // field
    private double l;
    private double w;
    private double a;
    private double p;

    // method get for return it value
    public double getLength(){
        return l;
    }

    public double getWidth(){
        return w;
    }

    public double getArea(){
        return a;
    }

    public double getPerimeter(){
        return p;
    }

    // method set for set the value
    public void setLength(double l){
        if( l > 0){
            this.l = l;
        }else{
            System.out.println("Unsufficent Number");
        }
    }

    public void setWidth(double w){
        if( w > 0){
            this.w = w;
        }else{
            System.out.println("Unsufficent Number");
        }
    }

    // method for calculate area 
    public double CalcArea(){
        a = l * w;
        System.out.println("Area of rectangle is "+ a);
        return a;

    }
    // method for calculate perimeter
    public double CalcPerimeter(){
        double add =  l + w;
        p = add * 2;
        System.out.println("Perimeter of rectange is "+ p);
        return p;
    }

}



public class PractiseThree {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(12);
        r1.setWidth(34);
        r1.CalcArea();
    }
}
