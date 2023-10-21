package abstraction;

// subclass 
abstract class Cooking{
    // field
    protected boolean egg;
    protected boolean flour;
    protected boolean sugar;
    protected boolean cream;
    protected boolean vegs;
    protected boolean avacado;
    protected boolean oil;
    protected boolean chickenstock;
    protected boolean soupmasale;

    //constructor
    public Cooking(boolean egg, boolean flour, boolean sugar, boolean cream, boolean vegs, boolean avacado, boolean oil, boolean chickenstock, boolean soupmasale){
        this.egg = egg;
        this.flour = flour;
        this.sugar = sugar;
        this.cream = cream;
        this.vegs = vegs;
        this.avacado = avacado;
        this.oil = oil;
        this.chickenstock = chickenstock;
        this.soupmasale = soupmasale;

    }


    //method
    public abstract void prepareIngredients();

    // method for cook
    public abstract void cook();

    
}


// subclass
class Cakes extends Cooking{

    // constructor
    public Cakes(boolean egg,  boolean flour, boolean sugar ,boolean cream){
        super(egg, flour, sugar, cream, false, false, false, false, false);
    }

    @Override
    public void prepareIngredients(){
        System.out.println("It is process successfull!!");
    }

    @Override
    public void cook(){
        System.out.println("It is cooked!!");
    }
}

class Soup extends Cooking{

    // constructor
    public Soup(boolean egg,  boolean chickenstock, boolean soupmasale, boolean oil){
        super(egg, false, false, false, false, false, oil , chickenstock, soupmasale);
    }

    @Override
    public void prepareIngredients(){
        System.out.println("It is process successfull!!");
    }

    @Override
    public void cook(){
        System.out.println("It is cooked!!");
    }
}

class Salad extends Cooking{

    // constructor
    public Salad(boolean vegs,  boolean avacado, boolean oil, boolean cream){
        super(false, false, false, cream, vegs, avacado, oil , false, false);
    }

    @Override
    public void prepareIngredients(){
        System.out.println("It is process successfull!!");
    }

    @Override
    public void cook(){
        System.out.println("It is cooked!!");
    }
}

public class FIve {
    public static void main(String[] args) {
        Cooking i1 = new Cakes(true, true, true, true);
        i1.prepareIngredients();
        i1.cook();
    }
}
