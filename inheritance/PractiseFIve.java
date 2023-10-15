package inheritance;

// class Product
class Product{

    // field
    private String productName;
    private double price;
    private String category;

    // constructor
    public Product(String productName, double price, String category){
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // getter to get access private field
    public String getProductName(){
        return productName;
    }
    
    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    //method
    public void displayProduct(){
        System.out.println(productName);
        System.out.println(price);
        System.out.println(category);
        System.out.println();
    }

}

// subclass for Electronics
class Electronics extends Product{
    
    // field 
    private String manufacture;

    //constructor
    public Electronics(String productName, double price, String category, String manufacture){
        super(productName, price, category);
        this.manufacture = manufacture;
    }


    // method
    public void displayManufacture(){
        System.out.println(getProductName());
        System.out.println(getPrice());
        System.out.println(getCategory());
        System.out.println(manufacture);
        System.out.println();
    }

}

// subclass for Clothing 
class Clothing extends Product{

    //fields
    private int size;

    // constructor
    public Clothing(String productName, double price, String category, int size){
        super(productName, price, category);
        this.size = size;

    }

    // method
    public void displayClothing(){
        System.out.println(getProductName());
        System.out.println(getPrice());
        System.out.println(getCategory());
        System.out.println(size);
        System.out.println();
    }

    
}

public class PractiseFIve {
    public static void main(String[] args) {

        // Test Electronics
        Electronics p1 = new Electronics("SDKFJLDKSF", 1234, "djflkjdf", "23213123");
        p1.displayManufacture();

        // Test product
        Product p2 = new Product("lkdfsf", 1234, "23323232");
        p2.displayProduct();

        // Test Clothing
        Clothing p3 = new Clothing("sdkfksdf", 232, "ldskjfkdsjf", 12);
        p3.displayClothing();
    }
}
