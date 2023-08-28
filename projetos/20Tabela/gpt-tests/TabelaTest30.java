package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTest30{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        tabela.registros[3] = item3;
        tabela.n = 3;

        assertEquals(1, tabela.pesquisa(item1));
        assertEquals(2, tabela.pesquisa(item2));
        assertEquals(3, tabela.pesquisa(item3));
    }

    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        tabela.insere(item1);
        tabela.insere(item2);

        assertEquals(1, tabela.registros[1].recuperaChave());
        assertEquals(2, tabela.registros[2].recuperaChave());
        assertEquals(2, tabela.n);
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        tabela.registros[1] = item1;
        tabela.registros[2] = item2;
        tabela.registros[3] = item3;
        tabela.n = 3;

        assertEquals(1, tabela.binaria(item1));
        assertEquals(2, tabela.binaria(item2));
        assertEquals(3, tabela.binaria(item3));
    }
}