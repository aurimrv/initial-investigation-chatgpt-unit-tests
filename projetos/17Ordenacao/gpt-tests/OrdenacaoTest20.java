package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest20{


    @Test
    public void testPermutWithItemArray() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.permut(v, 5);
        for (int i = 0; i < 5; i++) {
            assertNotNull(v[i]);
        }
    }

    @Test
    public void testPermutWithIntArray() {
        int[] v = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = i;
        }
        Ordenacao.permut(v, 5);
        for (int i = 0; i < 5; i++) {
            assertNotEquals(i, v[i]);
        }
    }

    @Test
    public void testPermutWithCharArray() {
        char[] v = new char[5];
        for (int i = 0; i < 5; i++) {
            v[i] = (char)('a' + i);
        }
        Ordenacao.permut(v, 5);
        for (int i = 0; i < 5; i++) {
            assertNotEquals((char)('a' + i), v[i]);
        }
    }

    @Test
    public void testSelecao() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.selecao(v, 5);
        for (int i = 0; i < 4; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testInsercao() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.insercao(v, 5);
        for (int i = 0; i < 4; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testShellsort() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.shellsort(v, 5);
        for (int i = 0; i < 4; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testQuicksort() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.quicksort(v, 5);
        for (int i = 0; i < 4; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }

    @Test
    public void testHeapsort() {
        Item[] v = new Item[5];
        for (int i = 0; i < 5; i++) {
            v[i] = new MeuItem(i);
        }
        Ordenacao.heapsort(v, 5);
        for (int i = 0; i < 4; i++) {
            assertTrue(v[i].compara(v[i + 1]) <= 0);
        }
    }
}