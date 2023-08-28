package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest13{


    @Test
    public void testMaxWithPositiveNumbers() {
        Item[] items = new Item[]{new MeuItem(5), new MeuItem(10), new MeuItem(7)};
        Item max = Max.max(items, items.length);
        assertEquals(10, ((MeuItem) max).chave);
    }

    @Test
    public void testMaxWithNegativeNumbers() {
        Item[] items = new Item[]{new MeuItem(-5), new MeuItem(-10), new MeuItem(-7)};
        Item max = Max.max(items, items.length);
        assertEquals(-5, ((MeuItem) max).chave);
    }

    @Test
    public void testMaxWithMixedNumbers() {
        Item[] items = new Item[]{new MeuItem(5), new MeuItem(-10), new MeuItem(7)};
        Item max = Max.max(items, items.length);
        assertEquals(7, ((MeuItem) max).chave);
    }

    @Test
    public void testMaxWithEmptyArray() {
        Item[] items = new Item[]{};
        Item max = Max.max(items, items.length);
        assertNull(max);
    }
}