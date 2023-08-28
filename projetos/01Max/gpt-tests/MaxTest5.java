
package ds;import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest5 {

    @Test
    public void testMax_returnsMaxItem() {
        Item[] items = {new MeuItem(3), new MeuItem(1), new MeuItem(5)};
        Item max = Max.max(items, 3);
        assertEquals(5, ((MeuItem) max).chave);
    }

    @Test
    public void testMax_returnsFirstItem_whenAllItemsAreEqual() {
        Item[] items = {new MeuItem(4), new MeuItem(4), new MeuItem(4)};
        Item max = Max.max(items, 3);
        assertEquals(4, ((MeuItem) max).chave);
    }

    @Test
    public void testMax_returnsLastItem_whenMaxItemIsLast() {
        Item[] items = {new MeuItem(2), new MeuItem(7), new MeuItem(9)};
        Item max = Max.max(items, 3);
        assertEquals(9, ((MeuItem) max).chave);
    }
    
    @Test
    public void testMax_returnsNull_whenArrayIsEmpty() {
        Item[] items = {};
        Item max = Max.max(items, 0);
        assertNull(max);
    }
}
