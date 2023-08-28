package ds;import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class OrdenacaoTest19{


    @Test
    public void testPermutWithItemArray() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(5);

        Ordenacao.permut(v, 5);

        assertNotEquals(v[0], new MeuItem(1));
        assertNotEquals(v[1], new MeuItem(2));
        assertNotEquals(v[2], new MeuItem(3));
        assertNotEquals(v[3], new MeuItem(4));
        assertNotEquals(v[4], new MeuItem(5));
    }

    @Test
    public void testPermutWithIntArray() {
        int[] v = new int[]{1, 2, 3, 4, 5};

        Ordenacao.permut(v, 5);

        assertNotEquals(v[0], 1);
        assertNotEquals(v[1], 2);
        assertNotEquals(v[2], 3);
        assertNotEquals(v[3], 4);
        assertNotEquals(v[4], 5);
    }

    @Test
    public void testPermutWithCharArray() {
        char[] v = new char[]{'a', 'b', 'c', 'd', 'e'};

        Ordenacao.permut(v, 5);

        assertNotEquals(v[0], 'a');
        assertNotEquals(v[1], 'b');
        assertNotEquals(v[2], 'c');
        assertNotEquals(v[3], 'd');
        assertNotEquals(v[4], 'e');
    }

    @Test
    public void testSelecao() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(2);
        v[4] = new MeuItem(1);

        Ordenacao.selecao(v, 5);

        assertEquals(v[0], new MeuItem(1));
        assertEquals(v[1], new MeuItem(2));
        assertEquals(v[2], new MeuItem(3));
        assertEquals(v[3], new MeuItem(4));
        assertEquals(v[4], new MeuItem(5));
    }

    @Test
    public void testInsercao() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(2);
        v[4] = new MeuItem(1);

        Ordenacao.insercao(v, 5);

        assertEquals(v[0], new MeuItem(1));
        assertEquals(v[1], new MeuItem(2));
        assertEquals(v[2], new MeuItem(3));
        assertEquals(v[3], new MeuItem(4));
        assertEquals(v[4], new MeuItem(5));
    }

    @Test
    public void testShellsort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(2);
        v[4] = new MeuItem(1);

        Ordenacao.shellsort(v, 5);

        assertEquals(v[0], new MeuItem(1));
        assertEquals(v[1], new MeuItem(2));
        assertEquals(v[2], new MeuItem(3));
        assertEquals(v[3], new MeuItem(4));
        assertEquals(v[4], new MeuItem(5));
    }

    @Test
    public void testQuicksort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(2);
        v[4] = new MeuItem(1);

        Ordenacao.quicksort(v, 5);

        assertEquals(v[0], new MeuItem(1));
        assertEquals(v[1], new MeuItem(2));
        assertEquals(v[2], new MeuItem(3));
        assertEquals(v[3], new MeuItem(4));
        assertEquals(v[4], new MeuItem(5));
    }

    @Test
    public void testHeapsort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(2);
        v[4] = new MeuItem(1);

        Ordenacao.heapsort(v, 5);

        assertEquals(v[0], new MeuItem(1));
        assertEquals(v[1], new MeuItem(2));
        assertEquals(v[2], new MeuItem(3));
        assertEquals(v[3], new MeuItem(4));
        assertEquals(v[4], new MeuItem(5));
    }
}