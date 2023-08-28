package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest25{

  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = {new MeuItem(5), new MeuItem(8), new MeuItem(3)};
    Item maxItem = Max.max(items, 3);
    assertEquals(8, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = {new MeuItem(-5), new MeuItem(-8), new MeuItem(-3)};
    Item maxItem = Max.max(items, 3);
    assertEquals(-3, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithMixedNumbers() {
    Item[] items = {new MeuItem(-5), new MeuItem(8), new MeuItem(-3)};
    Item maxItem = Max.max(items, 3);
    assertEquals(8, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] items = {};
    Item maxItem = Max.max(items, 0);
    assertNull(maxItem);
  }
  
  @Test
  public void testMaxWithSingleItem() {
    Item[] items = {new MeuItem(5)};
    Item maxItem = Max.max(items, 1);
    assertEquals(5, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithDuplicateItems() {
    Item[] items = {new MeuItem(5), new MeuItem(5), new MeuItem(5)};
    Item maxItem = Max.max(items, 3);
    assertEquals(5, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithNullItems() {
    Item[] items = {null, null, null};
    Item maxItem = Max.max(items, 3);
    assertNull(maxItem);
  }
}