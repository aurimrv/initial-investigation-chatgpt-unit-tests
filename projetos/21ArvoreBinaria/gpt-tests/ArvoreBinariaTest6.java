
package ds;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArvoreBinariaTest6 {
  
  private ArvoreBinaria arvore;
  
  @Before
  public void setUp() {
    arvore = new ArvoreBinaria();
  }
  
  @Test
  public void testInsercao() {
    MeuItem item1 = new MeuItem(1);
    arvore.insere(item1);
    
    assertEquals(item1, arvore.pesquisa(item1));
    
    MeuItem item2 = new MeuItem(2);
    arvore.insere(item2);
    
    assertEquals(item2, arvore.pesquisa(item2));
    
    MeuItem item3 = new MeuItem(3);
    arvore.insere(item3);
    
    assertEquals(item3, arvore.pesquisa(item3));
  }
  
  @Test
  public void testRemocao() {
    MeuItem item1 = new MeuItem(1);
    arvore.insere(item1);
    MeuItem item2 = new MeuItem(2);
    arvore.insere(item2);
    MeuItem item3 = new MeuItem(3);
    arvore.insere(item3);
    
    arvore.retira(item2);
    
    assertEquals(item1, arvore.pesquisa(item1));
    assertNull(arvore.pesquisa(item2));
    assertEquals(item3, arvore.pesquisa(item3));
  }
  
  @Test
  public void testIntegridade() {
    MeuItem item1 = new MeuItem(4);
    arvore.insere(item1);
    MeuItem item2 = new MeuItem(2);
    arvore.insere(item2);
    MeuItem item3 = new MeuItem(6);
    arvore.insere(item3);
    MeuItem item4 = new MeuItem(1);
    arvore.insere(item4);
    MeuItem item5 = new MeuItem(3);
    arvore.insere(item5);
    
    arvore.testa();
  }
}
