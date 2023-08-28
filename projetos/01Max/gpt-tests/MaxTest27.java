package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest27{


    @Test
    public void testMaxWithEmptyArray() {
        Item[] v = new Item[0];
        assertNull(Max.max(v, 0));
    }

    @Test
    public void testMaxWithSingleItem() {
        Item[] v = new Item[1];
        v[0] = new MeuItem(10);
        assertEquals(v[0], Max.max(v, 1));
    }

    @Test
    public void testMaxWithMultipleItems() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        assertEquals(v[1], Max.max(v, 5));
    }
}