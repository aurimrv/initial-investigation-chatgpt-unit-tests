package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest22{


    @Test
    public void testMaxWithEmptyArray() {
        Item[] v = new Item[0];
        assertNull(Max.max(v, 0));
    }

    @Test
    public void testMaxWithSingleItem() {
        Item[] v = new Item[1];
        v[0] = new MeuItem(5);
        assertEquals(5, ((MeuItem) Max.max(v, 1)).chave);
    }

    @Test
    public void testMaxWithMultipleItems() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(3);
        v[1] = new MeuItem(7);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(9);
        v[4] = new MeuItem(1);
        assertEquals(9, ((MeuItem) Max.max(v, 5)).chave);
    }
}