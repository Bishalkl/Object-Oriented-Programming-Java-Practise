package encapsulation;

class Book{
    // field
    private String title;
    private String author;
    private double price;

    // method for get
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return  price;
    }

    // method to setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(Double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Error!!");
        }
    }

    

}

public class PractiseOne {
    public static void main(String[] args) {
        
    }
}
