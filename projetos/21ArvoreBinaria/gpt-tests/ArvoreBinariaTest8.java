
package ds;import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class ArvoreBinariaTest8 {
  
  // Test for pesquisa() method
  @Test
  public void testPesquisa() {
    // Create a binary tree
    ArvoreBinaria tree = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    Item item4 = new MeuItem(4);
    Item item5 = new MeuItem(5);

    tree.insere(item1);
    tree.insere(item2);
    tree.insere(item3);
    tree.insere(item4);
    tree.insere(item5);
    
    // Test search for existing item
    Item result1 = tree.pesquisa(item3);
    assertNotNull(result1);
    assertEquals(item3, result1);
    
    // Test search for non-existing item
    Item item6 = new MeuItem(6);
    Item result2 = tree.pesquisa(item6);
    assertNull(result2);
  }
  
  // Test for insere() method
  @Test
  public void testInsere() {
    // Create a binary tree
    ArvoreBinaria tree = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    Item item4 = new MeuItem(4);
    Item item5 = new MeuItem(5);

    // Insert items into the tree
    tree.insere(item1);
    tree.insere(item2);
    tree.insere(item3);
    tree.insere(item4);
    
    // Check if the items are inserted correctly
    Item result1 = tree.pesquisa(item1);
    assertNotNull(result1);
    assertEquals(item1, result1);
    
    Item result2 = tree.pesquisa(item2);
    assertNotNull(result2);
    assertEquals(item2, result2);
    
    Item result3 = tree.pesquisa(item3);
    assertNotNull(result3);
    assertEquals(item3, result3);
    
    Item result4 = tree.pesquisa(item4);
    assertNotNull(result4);
    assertEquals(item4, result4);
    
    // Check if an item that is not inserted is not present in the tree
    Item item6 = new MeuItem(6);
    Item result5 = tree.pesquisa(item6);
    assertNull(result5);
  }
  
  // Test for retira() method
  @Test
  public void testRetira() {
    // Create a binary tree
    ArvoreBinaria tree = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    Item item4 = new MeuItem(4);
    Item item5 = new MeuItem(5);

    // Insert items into the tree
    tree.insere(item1);
    tree.insere(item2);
    tree.insere(item3);
    tree.insere(item4);
    
    // Remove item2 and check if it is removed correctly
    tree.retira(item2);
    Item result1 = tree.pesquisa(item2);
    assertNull(result1);
    
    // Try to remove item2 again and check if it still doesn't exist in the tree
    tree.retira(item2);
    Item result2 = tree.pesquisa(item2);
    assertNull(result2);
    
    // Check if the other items are still present in the tree
    Item result3 = tree.pesquisa(item1);
    assertNotNull(result3);
    assertEquals(item1, result3);
    
    Item result4 = tree.pesquisa(item3);
    assertNotNull(result4);
    assertEquals(item3, result4);
    
    Item result5 = tree.pesquisa(item4);
    assertNotNull(result5);
    assertEquals(item4, result5);
  }
  
  // Test for testa() method
  @Test
  public void testTesta() {
    // Create a binary tree
    ArvoreBinaria tree = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    
    tree.insere(item2);
    tree.insere(item3);
    tree.insere(item1);
    
    // Check if the testa() method runs without any error
    tree.testa();
  }
  
}