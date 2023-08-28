package ds;import ds.Item;
import ds.Max;
import ds.MeuItem;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest14{

    
    @Test
    public void testMaxWithThreeItems() {
        Item[] items = new Item[3];
        items[0] = new MeuItem(5);
        items[1] = new MeuItem(10);
        items[2] = new MeuItem(7);
        
        Item result = Max.max(items, 3);
        
        Assert.assertEquals(10, ((MeuItem)result).chave);
    }
    
    @Test
    public void testMaxWithEmptyArray() {
        Item[] items = new Item[0];
        
        Item result = Max.max(items, 0);
        
        Assert.assertNull(result);
    }
    
    @Test
    public void testMaxWithOneItem() {
        Item[] items = new Item[1];
        items[0] = new MeuItem(5);
        
        Item result = Max.max(items, 1);
        
        Assert.assertEquals(5, ((MeuItem)result).chave);
    }
    
    @Test
    public void testMaxWithNegativeItems() {
        Item[] items = new Item[4];
        items[0] = new MeuItem(-5);
        items[1] = new MeuItem(-10);
        items[2] = new MeuItem(-7);
        items[3] = new MeuItem(-3);
        
        Item result = Max.max(items, 4);
        
        Assert.assertEquals(-3, ((MeuItem)result).chave);
    }
}