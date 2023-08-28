package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest32{


    @Test
    public void testSelecao() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.selecao(v, 5);

        assertEquals(1, v[0].recuperaChave());
        assertEquals(2, v[1].recuperaChave());
        assertEquals(3, v[2].recuperaChave());
        assertEquals(4, v[3].recuperaChave());
        assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testInsercao() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.insercao(v, 5);

        assertEquals(1, v[0].recuperaChave());
        assertEquals(2, v[1].recuperaChave());
        assertEquals(3, v[2].recuperaChave());
        assertEquals(4, v[3].recuperaChave());
        assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testShellsort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.shellsort(v, 5);

        assertEquals(1, v[0].recuperaChave());
        assertEquals(2, v[1].recuperaChave());
        assertEquals(3, v[2].recuperaChave());
        assertEquals(4, v[3].recuperaChave());
        assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testQuicksort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.quicksort(v, 5);

        assertEquals(1, v[0].recuperaChave());
        assertEquals(2, v[1].recuperaChave());
        assertEquals(3, v[2].recuperaChave());
        assertEquals(4, v[3].recuperaChave());
        assertEquals(5, v[4].recuperaChave());
    }

    @Test
    public void testHeapsort() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(2);

        Ordenacao.heapsort(v, 5);

        assertEquals(1, v[0].recuperaChave());
        assertEquals(2, v[1].recuperaChave());
        assertEquals(3, v[2].recuperaChave());
        assertEquals(4, v[3].recuperaChave());
        assertEquals(5, v[4].recuperaChave());
    }
}