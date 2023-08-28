package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest23{

  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = {new MeuItem(5), new MeuItem(10), new MeuItem(3), new MeuItem(8)};
    Item maxItem = Max.max(items, items.length);
    assertEquals(10, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = {new MeuItem(-5), new MeuItem(-10), new MeuItem(-3), new MeuItem(-8)};
    Item maxItem = Max.max(items, items.length);
    assertEquals(-3, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithMixedNumbers() {
    Item[] items = {new MeuItem(-5), new MeuItem(10), new MeuItem(0), new MeuItem(-8)};
    Item maxItem = Max.max(items, items.length);
    assertEquals(10, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithSingleItem() {
    Item[] items = {new MeuItem(5)};
    Item maxItem = Max.max(items, items.length);
    assertEquals(5, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = {};
    Item maxItem = Max.max(items, items.length);
    assertNull(maxItem);
  }
}