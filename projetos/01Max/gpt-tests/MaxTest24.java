package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest24{


    @Test
    public void testMaxWithEmptyArray() {
        Item[] v = new Item[0];
        Item result = Max.max(v, 0);
        assertNull(result);
    }

    @Test
    public void testMaxWithSingleItem() {
        Item[] v = new Item[1];
        v[0] = new MeuItem(5);
        Item result = Max.max(v, 1);
        assertEquals(5, ((MeuItem) result).chave);
    }

    @Test
    public void testMaxWithMultipleItems() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(10);
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(8);
        v[3] = new MeuItem(3);
        v[4] = new MeuItem(12);
        Item result = Max.max(v, 5);
        assertEquals(12, ((MeuItem) result).chave);
    }

    @Test
    public void testMaxWithNegativeItems() {
        Item[] v = new Item[4];
        v[0] = new MeuItem(-5);
        v[1] = new MeuItem(-10);
        v[2] = new MeuItem(-2);
        v[3] = new MeuItem(-8);
        Item result = Max.max(v, 4);
        assertEquals(-2, ((MeuItem) result).chave);
    }
}