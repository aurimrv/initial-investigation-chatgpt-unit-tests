package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest12{

  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = new Item[] { new MeuItem(10), new MeuItem(5), new MeuItem(8), new MeuItem(12) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(12, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = new Item[] { new MeuItem(-10), new MeuItem(-5), new MeuItem(-8), new MeuItem(-12) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(-5, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithMixedNumbers() {
    Item[] items = new Item[] { new MeuItem(10), new MeuItem(-5), new MeuItem(0), new MeuItem(-12) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(10, ((MeuItem)maxItem).chave);
  }
  
  @Test
  public void testMaxWithDuplicateNumbers() {
    Item[] items = new Item[] { new MeuItem(10), new MeuItem(10), new MeuItem(10), new MeuItem(10) };
    Item maxItem = Max.max(items, items.length);
    assertEquals(10, ((MeuItem)maxItem).chave);
  }
}