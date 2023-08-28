package ds;import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest17{

  
  @Test
  public void testMaxWithPositiveNumbers() {
    Item[] v = {new MeuItem(5), new MeuItem(3), new MeuItem(7), new MeuItem(1)};
    Item max = Max.max(v, 4);
    assertEquals(7, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithNegativeNumbers() {
    Item[] v = {new MeuItem(-5), new MeuItem(-3), new MeuItem(-7), new MeuItem(-1)};
    Item max = Max.max(v, 4);
    assertEquals(-1, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithMixedNumbers() {
    Item[] v = {new MeuItem(5), new MeuItem(-3), new MeuItem(7), new MeuItem(-1)};
    Item max = Max.max(v, 4);
    assertEquals(7, ((MeuItem) max).chave);
  }
  
  @Test
  public void testMaxWithEmptyArray() {
    Item[] v = {};
    Item max = Max.max(v, 0);
    assertEquals(null, max);
  }
  
  @Test
  public void testMaxWithSingleElementArray() {
    Item[] v = {new MeuItem(5)};
    Item max = Max.max(v, 1);
    assertEquals(5, ((MeuItem) max).chave);
  }
}