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
b.retire("truc2");
}



@Test(expected = IndexOutOfBoundsException.class)
public void retireWithException() {
        Box b = new Box();
        b.add("truc1");
        b.retire("truc4");
}
}