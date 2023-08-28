
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaTest3 {

    @Test
    public void testRand0a1() {
        Random rand = new Random();
        double result = PermutacaoRandomica.rand0a1(rand);
        assertTrue(result >= 0 && result < 1);
    }


    @Test
    public void testPermutItemArray() {
        Item[] v = new Item[5];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(5);
        PermutacaoRandomica.permut(v, 5);
        // Add assertions to verify the permutation result
        // For example: assertNotEquals(v[0], new MeuItem(1));
    }



    @Test
    public void testPermutIntArray() {
        int[] v = {1, 2, 3, 4, 5};
        PermutacaoRandomica.permut(v, 5);
        // Add assertions to verify the permutation result
        // For example: assertNotEquals(v[0], 1);
    }


    @Test
    public void testPermutCharArray() {
        char[] v = {'a', 'b', 'c', 'd', 'e'};
        PermutacaoRandomica.permut(v, 5);
        // Add assertions to verify the permutation result
        // For example: assertNotEquals(v[0], 'a');
    }



    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        tabela.registros = new Item[3];
        tabela.registros[0] = new MeuItem(1);
        tabela.registros[1] = new MeuItem(2);
        tabela.registros[2] = new MeuItem(3);
        tabela.n = 3;
        int result = tabela.pesquisa(new MeuItem(2));
        assertEquals(1, result);
    }



    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        tabela.registros = new Item[3];
        tabela.n = 2;
        tabela.insere(new MeuItem(3));
        assertEquals(3, tabela.registros[3].recuperaChave());
        assertEquals(3, tabela.n);
    }



    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        tabela.registros = new Item[5];
        tabela.registros[0] = new MeuItem(1);
        tabela.registros[1] = new MeuItem(2);
        tabela.registros[2] = new MeuItem(3);
        tabela.registros[3] = new MeuItem(4);
        tabela.registros[4] = new MeuItem(5);
        tabela.n = 5;
        int result = tabela.binaria(new MeuItem(3));
        assertEquals(2, result);
    }
    }
