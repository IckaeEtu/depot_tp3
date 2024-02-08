import java.util.ArrayList;

class Box{
    
    private ArrayList<Thing> contents = new ArrayList<Thing>();

    public void add(String truc) {
        Thing thing = new Thing(truc);
        this.contents.add(thing);
    }

    public boolean estDeDans(Thing thing){
        return this.contents.contains(thing);
    }

    public void retire(String truc){
        Thing thing = new Thing(truc);
        if (!this.estDeDans(thing)){
            throw new IndexOutOfBoundsException("La boite ne contient pas" + truc);
        }
        this.contents.remove(thing);
            

    }
}