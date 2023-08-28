
package ds;
import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTest8 {

    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.registros = new Item[]{null, item1, item2};
        tabela.n = 2;

        assertEquals(1, tabela.pesquisa(item1));
        assertEquals(2, tabela.pesquisa(item2));
        assertEquals(0, tabela.pesquisa(new MeuItem(3)));
    }

    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.registros = new Item[]{null};
        tabela.n = 0;

        tabela.insere(item1);
        tabela.insere(item2);

        assertEquals(2, tabela.n);
        assertEquals(item1, tabela.registros[1]);
        assertEquals(item2, tabela.registros[2]);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.registros = new Item[]{null, item1, item2};
        tabela.n = 2;

        assertEquals(1, tabela.binaria(item1));
        assertEquals(2, tabela.binaria(item2));
        assertEquals(0, tabela.binaria(new MeuItem(3)));
    }
}