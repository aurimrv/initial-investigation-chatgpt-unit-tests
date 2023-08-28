
package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest7 {

    @Test
    public void testMax() {
        Item[] v = {new MeuItem(7), new MeuItem(3), new MeuItem(9), new MeuItem(5)};
        Item max = Max.max(v, 4);
        assertEquals(9, max.chave);
    }
    
    @Test
    public void testMaxWithNegativeNumbers() {
        Item[] v = {new MeuItem(-2), new MeuItem(-7), new MeuItem(-4), new MeuItem(-9)};
        Item max = Max.max(v, 4);
        assertEquals(-2, max.chave);
    }
    
    @Test
    public void testMaxWithDuplicateValues() {
        Item[] v = {new MeuItem(5), new MeuItem(5), new MeuItem(5), new MeuItem(5)};
        Item max = Max.max(v, 4);
        assertEquals(5, max.chave);
    }
    
    @Test
    public void testMaxWithEmptyArray() {
        Item[] v = {};
        Item max = Max.max(v, 0);
        assertNull(max);
    }
    
    @Test
    public void testMaxWithNullItems() {
        Item[] v = {new MeuItem(7), null, new MeuItem(9), new MeuItem(5)};
        Item max = Max.max(v, 4);
        assertEquals(9, max.chave);
    }
    
    @Test
    public void testMaxWithSingleItem() {
        Item[] v = {new MeuItem(7)};
        Item max = Max.max(v, 1);
        assertEquals(7, max.chave);
    }
}