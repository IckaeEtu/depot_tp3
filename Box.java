import java.util.ArrayList;

class Box{
    
    private ArrayList<Thing> contents = new ArrayList<Thing>();
    private boolean open = false;

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

    public boolean isOpen(){
        return this.open;
    }

    public void open(){
        this.open = true;
    }

    public void close(){
        this.open = false;
    }

    public String actionLook() {
        if (this.isOpen()) {
            String phrase = "La boite contient:";
            for (Thing thing: this.contents){
                phrase += thing.getName();
            }
            return phrase;
        }
        else {
            String phrase = "La boite est fermé";
            return phrase;
        }
    }
}