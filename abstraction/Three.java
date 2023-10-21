package abstraction;

// super abstract clas
abstract class MediaItems{
    // field
    protected String title;
    protected String author;
    protected String songWriter;
    protected String singer;
    protected String director;

    //constructor
    public MediaItems(String title, String author, String songWriter, String singer, String director){
        this.title = title;
        this.author = author;
        this.songWriter = songWriter;
        this.singer = singer;
        this.director = director;
    }

    // method 
    public abstract void displayInfo();

    // getter method 
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

}

// subclass 


// Movie
class Movie extends MediaItems{

    // constructor
    public Movie(String title, String director){
        super(title, null, null, null, director);        
    }


    @Override
    public void displayInfo(){
        System.out.println();
        System.out.println("The title of this movie is "+super.title);
        System.out.println("The director of this movie is "+super.director);
    }
}

// Book
class Book extends MediaItems{

    // constructor
    public Book(String title, String author){
        super(title, author, null, null, null);
    }


    @Override
    public void displayInfo(){
        System.out.println();
        System.out.println("The title of this book is "+super.title);
        System.out.println("The author of this book is "+super.author);
    }
}

// Music
class Music extends MediaItems{

    // constructor
    public Music(String title, String songWriter, String singer){
        super(title, null, songWriter, singer, null);
    }


    @Override
    public void displayInfo(){
        System.out.println();
        System.out.println("The title of this music is "+ super.title);
        System.out.println("The song writer of this music is "+ super.songWriter);
        System.out.println("The singer of this music is "+ super.singer);
    }
}
public class Three {
    public static void main(String[] args) {

        // Test music
        MediaItems m1 = new Music("Farkana hola", "John chamling", "John chamling");

        m1.displayInfo();

        // Test movie
        MediaItems m2 = new Movie("Your name", "Mokoto sinkhai");

        m2.displayInfo();

        // Test book
        MediaItems m3 = new Book("Grow and rich", "Nepolian");
        m3.displayInfo();
    }
}
