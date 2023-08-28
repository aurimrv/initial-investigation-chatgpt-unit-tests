
package ds;
import static org.junit.Assert.*;
import org.junit.Test;

public class MaxTest9 {
  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] items = { new MeuItem(5), new MeuItem(2), new MeuItem(8), new MeuItem(3) };
    Item maxItem = Max.max(items, 4);
    assertEquals(8, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] items = { new MeuItem(-5), new MeuItem(-2), new MeuItem(-8), new MeuItem(-3) };
    Item maxItem = Max.max(items, 4);
    assertEquals(-2, ((MeuItem) maxItem).chave);
  }
  
  @Test
  public void testMaxWithZero() {
    Item[] items = { new MeuItem(0), new MeuItem(-2), new MeuItem(8), new MeuItem(3) };
    Item maxItem = Max.max(items, 4);
    assertEquals(8, ((MeuItem) maxItem).chave);
  }
}