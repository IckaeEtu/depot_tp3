public class Main {
    public static void main(String[] args) {
        Thing thing = new Thing("truc1");

    Box b = new Box();
    b.add("truc1");
    b.add("truc2");
    System.out.println(b.estDeDans(thing));
    }
}
