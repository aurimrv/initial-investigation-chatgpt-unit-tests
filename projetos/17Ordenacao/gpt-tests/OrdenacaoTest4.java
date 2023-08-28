
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest4 {
    @Test
    public void testPermutItem() {
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }
        
        Ordenacao.permut(v, 5);
        
        // Assert that the array is shuffled
        boolean isShuffled = false;
        for (int i = 1; i <= 5; i++) {
            if (v[i].compara(new MeuItem(i)) != 0) {
                isShuffled = true;
                break;
            }
        }
        assertTrue(isShuffled);
    }
}