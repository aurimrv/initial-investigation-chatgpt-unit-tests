
package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTest4 {
    
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
    public void testInsere() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        
        tabela.insere(reg1);
        
        assertEquals(1, tabela.n);
        assertEquals(reg1, tabela.registros[1]);
    }
    
    @Test(expected = Exception.class)
    public void testInsereFullTable() throws Exception {
        Tabela tabela = new Tabela();
        for (int i = 0; i < 10; i++) {
            Item reg = new MeuItem(i);
            tabela.insere(reg);
        }
        
        Item reg11 = new MeuItem(11);
        tabela.insere(reg11);
    }
    
    @Test
    public void testBinaria() {
        Tabela tabela = new Tabela();
        Item reg1 = new MeuItem(1);
        Item reg2 = new MeuItem(2);
        Item reg3 = new MeuItem(3);
        
        tabela.insere(reg1);
        tabela.insere(reg2);
        tabela.insere(reg3);
        
        assertEquals(1, tabela.binaria(reg1));
        assertEquals(2, tabela.binaria(reg2));
        assertEquals(3, tabela.binaria(reg3));
        
        Item reg4 = new MeuItem(4);
        assertEquals(0, tabela.binaria(reg4));
    }
}