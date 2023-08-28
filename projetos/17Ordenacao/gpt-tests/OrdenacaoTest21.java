package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest21{


    @Test
    public void testPermutWithItemArray() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.permut(v, v.length);
        for (int i = 0; i < v.length; i++) {
            assertNotNull(v[i]);
        }
    }

    @Test
    public void testPermutWithIntArray() {
        int[] v = new int[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        Ordenacao.permut(v, v.length);
        for (int i = 0; i < v.length; i++) {
            assertNotEquals(i, v[i]);
        }
    }

    @Test
    public void testPermutWithCharArray() {
        char[] v = new char[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = (char) (i + 97);
        }
        Ordenacao.permut(v, v.length);
        for (int i = 0; i < v.length; i++) {
            assertNotEquals((char) (i + 97), v[i]);
        }
    }

    @Test
    public void testSelecao() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.selecao(v, v.length);
        for (int i = 0; i < v.length - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testInsercao() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.insercao(v, v.length);
        for (int i = 0; i < v.length - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testShellsort() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.shellsort(v, v.length);
        for (int i = 0; i < v.length - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testQuicksort() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.quicksort(v, v.length);
        for (int i = 0; i < v.length - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testHeapsort() {
        Item[] v = new Item[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.heapsort(v, v.length);
        for (int i = 0; i < v.length - 1; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }
}