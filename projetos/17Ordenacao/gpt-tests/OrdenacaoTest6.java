
package ds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest6 {
    
    @Test
    public void testSelecao() {
        int[] arr = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.selecao(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertEquals(expected[i], items[i].recuperaChave());
        }
    }
    
    @Test
    public void testInsercao() {
        int[] arr = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.insercao(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertEquals(expected[i], items[i].recuperaChave());
        }
    }
    
    @Test
    public void testShellsort() {
        int[] arr = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.shellsort(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertEquals(expected[i], items[i].recuperaChave());
        }
    }
    
    @Test
    public void testQuicksort() {
        int[] arr = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.quicksort(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertEquals(expected[i], items[i].recuperaChave());
        }
    }
    
    @Test
    public void testHeapsort() {
        int[] arr = {5, 3, 8, 2, 1};
        int[] expected = {1, 2, 3, 5, 8};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.heapsort(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertEquals(expected[i], items[i].recuperaChave());
        }
    }
    
    @Test
    public void testPermut() {
        int[] arr = {5, 3, 8, 2, 1};
        Item[] items = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            items[i] = new MeuItem(arr[i]);
        }
        Ordenacao.permut(items, items.length);
        for (int i = 0; i < items.length; i++) {
            assertNotEquals(arr[i], items[i].recuperaChave());
        }
    }
    
}
