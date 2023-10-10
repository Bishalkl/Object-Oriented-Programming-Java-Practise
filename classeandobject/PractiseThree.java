package classeandobject;

// importing a package for do code...
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;



// class for Book that hold attributes
class Book{

    // attribute for Book property
    private String title;
    private String author;
    private double price;

    // Object Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // this to get private access for title
    public String getTitle(){
        return title;
    }
    // this to get private access for Author
    public String getAuthor(){
        return author;
    }
    // this to get private access for Price
    public double getPrice(){
        return price;
    }
    // to get private acess to updata and return books name, author and prices...
    public String toString(){
        return "Title: "+ title +" ,Author: " + author + " ,Price: RS." + price;
    }

}
// This class called inventory where i can change a data of books 

class Inventory{

    private List<Book> books;

    public Inventory(){
        books = new ArrayList<>();
    }

    // this for add books

    public void addBook(String title, String author, double price){
        Book book = new Book(title, author, price);
        books.add(book);
    }

    // this for remove books

    public void removeBook(String titleToremove){
        Iterator <Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(titleToremove)){
                iterator.remove();
                System.out.println("Removed: " + book);
            }
        }
    }

    public void displayInventory(){
        System.out.println("Inventory:");
        for(Book book : books) {
            System.out.println(book);
        }
    }


// this is main class where i can execute and test my code 
}

public class PractiseThree {
    public static void main(String[] args) {

        // this calling object to test
        Inventory inventory = new Inventory();

        // this is displaying books 
        inventory.displayInventory();

        // this to add books
        inventory.addBook("sdfjdfldjfdjf", "BIhsal dfjsdjklf jlkdj ", 1234.00);

        // this to remove books
        inventory.removeBook("sdfjdfldjfdjf");

    }

}
