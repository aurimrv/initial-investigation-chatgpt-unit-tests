package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class TabelaTest22{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);

        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);

        assertEquals(1, tabela.pesquisa(reg1));
        assertEquals(2, tabela.pesquisa(reg2));
        assertEquals(3, tabela.pesquisa(reg3));
    }

    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);

        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);

        assertEquals(3, tabela.n);
        assertEquals(reg1, tabela.registros[1]);
        assertEquals(reg2, tabela.registros[2]);
        assertEquals(reg3, tabela.registros[3]);
    }

    @Test(expected = Exception.class)
    public void testInsereTabelaCheia() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        Item reg4 = new MeuItem(4);
        Item reg5 = new MeuItem(5);
        Item reg6 = new MeuItem(6);
        Item reg7 = new MeuItem(7);
        Item reg8 = new MeuItem(8);
        Item reg9 = new MeuItem(9);
        Item reg10 = new MeuItem(10);
        Item reg11 = new MeuItem(11);

        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        tabela.insere(reg4);
        tabela.insere(reg5);
        tabela.insere(reg6);
        tabela.insere(reg7);
        tabela.insere(reg8);
        tabela.insere(reg9);
        tabela.insere(reg10);

        tabela.insere(reg11); // Should throw exception
    }

    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        Item reg4 = new MeuItem(4);
        Item reg5 = new MeuItem(5);

        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        tabela.insere(reg4);
        tabela.insere(reg5);

        assertEquals(1, tabela.binaria(reg1));
        assertEquals(2, tabela.binaria(reg2));
        assertEquals(3, tabela.binaria(reg3));
        assertEquals(4, tabela.binaria(reg4));
        assertEquals(5, tabela.binaria(reg5));
    }
}