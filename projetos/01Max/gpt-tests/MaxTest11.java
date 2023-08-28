
package ds;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest11 {
       @Test
       public void testMaxWithSingleElement() {
           Item[] items = {new MeuItem(5)};
           Item max = Max.max(items, 1);
           assertEquals(5, ((MeuItem) max).chave);
       }

       @Test
       public void testMaxWithMultipleElements() {
           Item[] items = {new MeuItem(5), new MeuItem(10), new MeuItem(7)};
           Item max = Max.max(items, 3);
           assertEquals(10, ((MeuItem) max).chave);
       }

       @Test
       public void testMaxWithNegativeValues() {
           Item[] items = {new MeuItem(-5), new MeuItem(-10), new MeuItem(-7)};
           Item max = Max.max(items, 3);
           assertEquals(-5, ((MeuItem) max).chave);
       }
    
       @Test
       public void testMaxWithDuplicateValues() {
           Item[] items = {new MeuItem(5), new MeuItem(10), new MeuItem(10)};
           Item max = Max.max(items, 3);
           assertEquals(10, ((MeuItem) max).chave);
       }
   }
   