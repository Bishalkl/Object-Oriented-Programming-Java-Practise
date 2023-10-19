package abstraction;

// Super class
abstract class Vechile{



    // method for speed
    public abstract void GetSpeed();

    // method for start
    public void start(){
        System.out.println("Start!!!");
    }

    // method for stop
    public void stop(){
        System.out.println("Stop!!!");
    }
    
}


// subclass
class Cars extends Vechile{


    @Override
    public void GetSpeed(){
        System.out.println("150 MPH");
    }

    @Override
    public void start(){
        System.out.println("Start!!!");
    }

    @Override
    public void stop(){
        System.out.println("Stop!!!");
    }
}

// subclass
class Bicycles extends Vechile{
    

    @Override
    public void GetSpeed(){
         System.out.println("10 MPH");
    }

    @Override
    public void start(){
        System.out.println("Start!!!");
    }

    @Override
    public void stop(){
        System.out.println("Stop!!!");
    }
}

// subclass
class Trucks extends Vechile{
    

    @Override
    public void GetSpeed(){
        System.out.println("100 MPH");
    }

    @Override
    public void start(){
        System.out.println("Start!!!");
    }

    @Override
    public void stop(){
        System.out.println("Stop!!!");
    }
}
public class Two {
    public static void main(String[] args) {
        Trucks t = new Trucks();
        t.GetSpeed();
    }
}
