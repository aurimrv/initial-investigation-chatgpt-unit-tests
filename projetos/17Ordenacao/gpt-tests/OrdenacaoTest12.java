package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest12{


    @Test
    public void testPermutWithItemArray() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(5);
        v[5] = new MeuItem(6);

        Ordenacao.permut(v, 6);

        for (int i = 0; i < v.length; i++) {
            assertNotNull(v[i]);
        }
    }

    @Test
    public void testPermutWithIntArray() {
        int[] v = {1, 2, 3, 4, 5, 6};

        Ordenacao.permut(v, 6);

        for (int i = 0; i < v.length; i++) {
            assertTrue(v[i] >= 1 && v[i] <= 6);
        }
    }

    @Test
    public void testPermutWithCharArray() {
        char[] v = {'a', 'b', 'c', 'd', 'e', 'f'};

        Ordenacao.permut(v, 6);

        for (int i = 0; i < v.length; i++) {
            assertTrue(v[i] >= 'a' && v[i] <= 'f');
        }
    }

    @Test
    public void testSelecao() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(6);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(1);
        v[4] = new MeuItem(4);
        v[5] = new MeuItem(3);

        Ordenacao.selecao(v, 6);

        for (int i = 1; i < v.length; i++) {
            assertTrue(v[i].compara(v[i-1]) >= 0);
        }
    }

    @Test
    public void testInsercao() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(6);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(1);
        v[4] = new MeuItem(4);
        v[5] = new MeuItem(3);

        Ordenacao.insercao(v, 6);

        for (int i = 1; i < v.length; i++) {
            assertTrue(v[i].compara(v[i-1]) >= 0);
        }
    }

    @Test
    public void testShellsort() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(6);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(1);
        v[4] = new MeuItem(4);
        v[5] = new MeuItem(3);

        Ordenacao.shellsort(v, 6);

        for (int i = 1; i < v.length; i++) {
            assertTrue(v[i].compara(v[i-1]) >= 0);
        }
    }

    @Test
    public void testQuicksort() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(6);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(1);
        v[4] = new MeuItem(4);
        v[5] = new MeuItem(3);

        Ordenacao.quicksort(v, 6);

        for (int i = 1; i < v.length; i++) {
            assertTrue(v[i].compara(v[i-1]) >= 0);
        }
    }

    @Test
    public void testHeapsort() {
        Item[] v = new Item[6];
        v[0] = new MeuItem(6);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(1);
        v[4] = new MeuItem(4);
        v[5] = new MeuItem(3);

        Ordenacao.heapsort(v, 6);

        for (int i = 1; i < v.length; i++) {
            assertTrue(v[i].compara(v[i-1]) >= 0);
        }
    }
}