package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;

public class TabelaTest18{

    
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
    }
}