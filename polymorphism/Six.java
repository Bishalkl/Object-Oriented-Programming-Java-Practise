package polymorphism;

// Super class 
class Plugin{
    // method 
    public void run(){

    }
}

// sub class
class PluginA extends Plugin{
    
    @Override
    public void run(){
        System.out.println("Run Plugin A!!");
    }
}

// sub class
class PluginB extends Plugin{
    
    @Override
    public void run(){
        System.out.println("Run Plugin B!!");
    }
}

// sub class
class PluginC extends Plugin{
    
    @Override
    public void run(){
        System.out.println("Run Plugin C!!");
    }
}
public class Six {
    public static void main(String[] args) {
        Plugin p1 = new PluginA();
        p1.run();;
    }
}
