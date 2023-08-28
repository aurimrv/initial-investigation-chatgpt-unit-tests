
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest8 {

    @Test
    public void testMax_withPositiveNumbers() {
        Item v[] = {new MeuItem(5), new MeuItem(8), new MeuItem(3)};
        Item result = Max.max(v, 3);
        assertEquals(8, ((MeuItem) result).chave);
    }

    @Test
    public void testMax_withNegativeNumbers() {
        Item v[] = {new MeuItem(-5), new MeuItem(-8), new MeuItem(-3)};
        Item result = Max.max(v, 3);
        assertEquals(-3, ((MeuItem) result).chave);
    }

    @Test
    public void testMax_withMixedNumbers() {
        Item v[] = {new MeuItem(5), new MeuItem(-8), new MeuItem(0)};
        Item result = Max.max(v, 3);
        assertEquals(5, ((MeuItem) result).chave);
    }

    @Test
    public void testMax_withEmptyArray() {
        Item v[] = {};
        Item result = Max.max(v, 0);
        assertNull(result);
    }

    @Test
    public void testMax_withSingleElement() {
        Item v[] = {new MeuItem(5)};
        Item result = Max.max(v, 1);
        assertEquals(5, ((MeuItem) result).chave);
    }
}