
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;
import java.util.Random;

public class ArvoreBinariaTest1 {
  
  @Test
  public void testInsere() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    assertEquals(item1, arvore.pesquisa(item1));
    assertEquals(item2, arvore.pesquisa(item2));
    assertEquals(item3, arvore.pesquisa(item3));
  }
  
  @Test
  public void testRetira() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    arvore.retira(item2);
    
    assertNull(arvore.pesquisa(item2));
  }
  
  @Test
  public void testPesquisa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    assertEquals(item1, arvore.pesquisa(item1));
    assertEquals(item2, arvore.pesquisa(item2));
    assertEquals(item3, arvore.pesquisa(item3));
    
    Item item4 = new MeuItem(4);
    assertNull(arvore.pesquisa(item4));
  }
  
  @Test
  public void testTesta() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    
    arvore.testa();
  }
  
  @Test
  public void testPermut() {
    int max = 10;
    MeuItem vetor[] = new MeuItem[max];
    
    for (int i = 0; i < max; i++)
      vetor[i] = new MeuItem(i);
    
    PermutacaoRandomica.permut(vetor, max);
    
    for (int i = 0; i < max; i++) {
      assertEquals(i, vetor[i].recuperaChave());
    }
  }
  
}