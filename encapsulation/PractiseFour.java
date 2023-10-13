package encapsulation;

class Car{
    // field
    private String name;
    private int year;

    // method to getter
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    // method to setter
    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        if(year >= 1886 && year <=2023){
            this.year = year;
        }else{
            System.out.println("Years is not vaild!!!");
        }
    }

    public void displayCar(){
        System.out.println("Name of car is "+name+".");
        System.out.println("Car was invented in "+year+" ");
    }
}

public class PractiseFour {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.setName("Hundai");
        carOne.setYear(2000);
        carOne.displayCar();
    }
}
