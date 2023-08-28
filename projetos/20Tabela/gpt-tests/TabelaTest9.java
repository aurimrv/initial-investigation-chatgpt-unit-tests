
package ds;
import ds.Item;
import ds.Tabela;
import ds.MeuItem;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class TabelaTest9 {

    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        tabela.registros[1] = item1;
        tabela.n = 1;
        assertEquals(1, tabela.pesquisa(item1));
        
        Item item2 = new MeuItem(2);
        assertEquals(0, tabela.pesquisa(item2));
    }

    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        tabela.insere(item1);
        assertEquals(item1, tabela.registros[1]);
        assertEquals(1, tabela.n);
        
        Item item2 = new MeuItem(2);
        tabela.insere(item2);
        assertEquals(item2, tabela.registros[2]);
        assertEquals(2, tabela.n);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        tabela.registros[1] = new MeuItem(1);
        tabela.registros[2] = new MeuItem(2);
        tabela.registros[3] = new MeuItem(3);
        tabela.n = 3;
        
        assertEquals(1, tabela.binaria(new MeuItem(1)));
        assertEquals(2, tabela.binaria(new MeuItem(2)));
        assertEquals(3, tabela.binaria(new MeuItem(3)));
        
        assertEquals(0, tabela.binaria(new MeuItem(4)));
        assertEquals(0, tabela.binaria(new MeuItem(0)));
    }
}