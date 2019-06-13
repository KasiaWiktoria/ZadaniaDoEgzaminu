/*
Proszę napisać klasę-test jednostkowy dla klasy Towar z pierwszego zadania.
Należy w pełni zaimplementować metody testowe dla metod equals i compareTo, inne
metody testowe wystarczy zadeklarować.
 */

package E2014;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TowarTest {

    @Test
    public void equalsTest(){
        Towar t = new Towar("chleb", 2,0.5);
        Towar z = new Towar("chleb", 2,0.5);
        Towar p = new Towar("jabłko", 1, 2);

        assertEquals(t,z);
        assertNotEquals(t,p);
    }

    @Test
    public void compareTo(){
        Towar t = new Towar("chleb", 2,0.5);
        Towar z = new Towar("chleb", 2,0.5);
        Towar p = new Towar("jabłko", 1, 2);
        Towar a = new Towar("abłko", 1, 2);

        assertTrue(t.compareTo(z) == 0);
        assertTrue(t.compareTo(p) < 0);
        assertTrue(t.compareTo(a) > 0);
    }

    @Test
    public void hashCodeTest(){}
    @Test
    public void getCenaTest(){}
    @Test
    public void toStringTest(){}

}
