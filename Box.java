import java.util.ArrayList;
import java.lang.Throwable;

class Box{
    
    private ArrayList<Thing> contents = new ArrayList<Thing>();

    public void add(String truc) {
        Thing thing = new Thing(truc);
        this.contents.add(thing);
    }

    public boolean estDeDans(Thing thing){
        return this.contents.contains(thing);
    }

    public boolean retire(String truc){
        Thing thing = new Thing(truc);
        try{
            return this.contents.remove(thing);
        }
        catch(IndexOutOfBoundsException iobe) {
            iobe.printStackTrace();
            
        }
        finally{
            System.out.println("finis");
        }
        
    }
}