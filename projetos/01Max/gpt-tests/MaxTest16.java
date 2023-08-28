package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest16{


    @Test
    public void testMaxWithPositiveIntegers() {
        Item[] items = new Item[] {
            new MeuItem(5),
            new MeuItem(3),
            new MeuItem(9),
            new MeuItem(2),
            new MeuItem(7)
        };
        Item maxItem = Max.max(items, items.length);
        assertEquals(9, ((MeuItem) maxItem).chave);
    }

    @Test
    public void testMaxWithNegativeIntegers() {
        Item[] items = new Item[] {
            new MeuItem(-5),
            new MeuItem(-3),
            new MeuItem(-9),
            new MeuItem(-2),
            new MeuItem(-7)
        };
        Item maxItem = Max.max(items, items.length);
        assertEquals(-2, ((MeuItem) maxItem).chave);
    }

    @Test
    public void testMaxWithMixedIntegers() {
        Item[] items = new Item[] {
            new MeuItem(-5),
            new MeuItem(3),
            new MeuItem(-9),
            new MeuItem(2),
            new MeuItem(-7)
        };
        Item maxItem = Max.max(items, items.length);
        assertEquals(3, ((MeuItem) maxItem).chave);
    }

    @Test
    public void testMaxWithSingleItem() {
        Item[] items = new Item[] {
            new MeuItem(5)
        };
        Item maxItem = Max.max(items, items.length);
        assertEquals(5, ((MeuItem) maxItem).chave);
    }

    @Test
    public void testMaxWithEmptyArray() {
        Item[] items = new Item[] {};
        Item maxItem = Max.max(items, items.length);
        assertNull(maxItem);
    }
}