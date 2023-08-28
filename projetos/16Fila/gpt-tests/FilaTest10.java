
package ds;
import org.junit.Assert;
import org.junit.Test;

public class FilaTest10 {

    @Test
    public void testEnfileira() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        Assert.assertFalse(fila.vazia());
    }
    
    @Test
    public void testDesenfileira() throws Exception {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        Assert.assertEquals(1, fila.desenfileira());
        Assert.assertEquals(2, fila.desenfileira());
        Assert.assertEquals(3, fila.desenfileira());
        
        Assert.assertTrue(fila.vazia());
    }
    
    @Test(expected = Exception.class)
    public void testDesenfileiraEmptyFila() throws Exception {
        Fila fila = new Fila();
        fila.desenfileira();
    }
    
    @Test
    public void testVazia() {
        Fila fila = new Fila();
        Assert.assertTrue(fila.vazia());
        
        fila.enfileira(1);
        Assert.assertFalse(fila.vazia());
        
        fila.desenfileira();
        Assert.assertTrue(fila.vazia());
    }
    
    @Test
    public void testImprime() {
        Fila fila = new Fila();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        fila.imprime();
        // Should print: 1 2 3
    }
}
