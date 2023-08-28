
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest7 {

    @Test
    public void testOrdenaWithEmptyArray() {
        int[] v = {};
        Ordenacao.ordena(v, 0);
        assertEquals(0, v.length);
    }
}