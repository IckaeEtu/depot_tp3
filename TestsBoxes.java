import org.junit.*;
public class TestsBoxes {



@Test
public void testBoxCreate() {
Box b = new Box();
}
/** on veut pouvoir mettre des trucs dedans */
@Test
public void testBoxAdd(){
Box b = new Box();
b.add("truc1");
b.add("truc2");
Thing thing = new Thing("truc1");
assert b.estDeDans(thing);
assert b.isOpen() == false;
b.open();
assert b.isOpen();

}



@Test(expected = IndexOutOfBoundsException.class)
public void retireWithException() {
        Box b = new Box();
        b.add("truc1");
        System.out.println("truc1 ajouté");
        b.retire("truc4");
        System.out.println("truc4 retire"); //ne s'affiche pas si excpetion
}
}