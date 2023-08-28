
package ds;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import ds.Item;
import ds.Tabela;

public class TabelaTest7 {
	
	@Test
	public void testPesquisa() {
		Tabela tabela = new Tabela();
		Item item1 = new MeuItem(1);
		Item item2 = new MeuItem(2);
		tabela.insere(item1);
		tabela.insere(item2);
		assertEquals(1, tabela.pesquisa(item1));
		assertEquals(2, tabela.pesquisa(item2));
		assertEquals(0, tabela.pesquisa(new MeuItem(3)));
	}
	
	@Test
	public void testInsere() throws Exception {
		Tabela tabela = new Tabela();
		Item item1 = new MeuItem(1);
		Item item2 = new MeuItem(2);
		tabela.insere(item1);
		tabela.insere(item2);
		assertEquals(2, tabela.n);
		assertEquals(item1, tabela.registros[1]);
		assertEquals(item2, tabela.registros[2]);
	}
	
	@Test(expected = Exception.class)
	public void testInsereFullTable() throws Exception {
		Tabela tabela = new Tabela();
		for(int i = 1; i <= 10; i++) {
			tabela.insere(new MeuItem(i));
		}
		tabela.insere(new MeuItem(11));
	}
	
	@Test
	public void testBinaria() {
		Tabela tabela = new Tabela();
		Item item1 = new MeuItem(1);
		Item item2 = new MeuItem(2);
		tabela.insere(item1);
		tabela.insere(item2);
		assertEquals(1, tabela.binaria(item1));
		assertEquals(2, tabela.binaria(item2));
		assertEquals(0, tabela.binaria(new MeuItem(3)));
	}
	
}
