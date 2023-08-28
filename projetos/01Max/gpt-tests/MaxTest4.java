
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.Item;
import ds.Max;
import ds.MeuItem;

public class MaxTest4 {

    @Test
    public void testMaxWithPositiveIntegers() {
        Item[] items = new Item[5];
        items[0] = new MeuItem(10);
        items[1] = new MeuItem(5);
        items[2] = new MeuItem(8);
        items[3] = new MeuItem(15);
        items[4] = new MeuItem(12);
        Item expectedResult = items[3];
        Item result = Max.max(items, 5);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxWithNegativeIntegers() {
        Item[] items = new Item[4];
        items[0] = new MeuItem(-5);
        items[1] = new MeuItem(-10);
        items[2] = new MeuItem(-3);
        items[3] = new MeuItem(-8);
        Item expectedResult = items[2];
        Item result = Max.max(items, 4);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxWithMixedIntegers() {
        Item[] items = new Item[6];
        items[0] = new MeuItem(-5);
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(-3);
        items[3] = new MeuItem(5);
        items[4] = new MeuItem(0);
        items[5] = new MeuItem(-8);
        Item expectedResult = items[1];
        Item result = Max.max(items, 6);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxWithSingleElement() {
        Item[] items = new Item[1];
        items[0] = new MeuItem(5);
        Item expectedResult = items[0];
        Item result = Max.max(items, 1);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMaxWithEmptyArray() {
        Item[] items = new Item[0];
        Item expectedResult = null;
        Item result = Max.max(items, 0);
        assertEquals(expectedResult, result);
    }
}