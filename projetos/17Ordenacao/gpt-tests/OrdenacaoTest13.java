package ds;import ds.*;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class OrdenacaoTest13{

    
    @Test
    public void testPermutWithItemArray() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.permut(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
    
    @Test
    public void testPermutWithIntArray() {
        int tam = 5, n = 5;
        int v[] = new int[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = i;
        
        Ordenacao.permut(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still integers
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof Integer);
        }
    }
    
    @Test
    public void testPermutWithCharArray() {
        int tam = 5, n = 5;
        char v[] = new char[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = (char) (i + 'A' - 1);
        
        Ordenacao.permut(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still characters
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof Character);
        }
    }
    
    @Test
    public void testSelecao() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.selecao(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
    
    @Test
    public void testInsercao() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.insercao(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
    
    @Test
    public void testShellsort() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.shellsort(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
    
    @Test
    public void testQuicksort() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.quicksort(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
    
    @Test
    public void testHeapsort() {
        int tam = 5, n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        Ordenacao.heapsort(v, n);
        
        // Check if the array is still the same length
        assertEquals(tam + 1, v.length);
        
        // Check if all elements are still MeuItem objects
        for (int i = 1; i <= n; i++) {
            assertTrue(v[i] instanceof MeuItem);
        }
    }
}