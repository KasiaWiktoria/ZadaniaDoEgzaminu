import org.junit.Test;
import static org.junit.Assert.*;

public class KajakTest {

    @Test
    public void compareToTest(){
        Kajak a = new Kajak("a",1999,5.2);
        Kajak b = new Kajak("b", 2010, 4.6);
        Kajak c = new Kajak("c", 2015, 6.1);
        Kajak d = new Kajak("a",1999,5.2);

        assertTrue(a.compareTo(b) > 0);
        assertTrue(a.compareTo(d) == 0);
        assertTrue(d.compareTo(c) < 0);
    }
    @Test
    public void equalsTest(){
        Kajak a = new Kajak("a",1999,5.2);
        Kajak b = new Kajak("b", 2010, 4.6);
        Kajak c = new Kajak("c", 2015, 6.1);
        Kajak d = new Kajak("a",1999,5.2);

        assertNotEquals(a,b);
        assertEquals(a,d);
    }
}
