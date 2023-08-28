package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;

public class TabelaTest13{


    @Test
    public void testPesquisa() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.registros[1] = reg1;
        tabela.n = 1;
        
        assertEquals(1, tabela.pesquisa(reg1));
        
        Item reg2 = new MeuItem(2);
        tabela.registros[2] = reg2;
        tabela.n = 2;
        
        assertEquals(2, tabela.pesquisa(reg2));
    }
    
    @Test
    public void testInsere() throws Exception {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.insere(reg1);
        
        assertEquals(1, tabela.n);
        assertEquals(reg1, tabela.registros[1]);
        
        Item reg2 = new MeuItem(2);
        tabela.insere(reg2);
        
        assertEquals(2, tabela.n);
        assertEquals(reg2, tabela.registros[2]);
    }
    
    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        tabela.registros[1] = reg1;
        tabela.n = 1;
        
        assertEquals(1, tabela.binaria(reg1));
        
        Item reg2 = new MeuItem(2);
        tabela.registros[2] = reg2;
        tabela.n = 2;
        
        assertEquals(2, tabela.binaria(reg2));
    }
}