
package ds;import org.junit.Test;
import java.util.Random;

public class ArvoreBinariaTest7 {

  @Test
  public void testPesquisa() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    arvore.insere(item1);
    arvore.insere(item2);
    arvore.insere(item3);
    assert arvore.pesquisa(item1) == item1;
    assert arvore.pesquisa(item2) == item2;
    assert arvore.pesquisa(item3) == item3;
  }

  @Test
  public void testInsere() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    arvore.insere(item1);
    assert arvore.pesquisa(item1) == item1;
    assert arvore.pesquisa(item2) == null;
    arvore.insere(item2);
    assert arvore.pesquisa(item2) == item2;
  }

  @Test
  public void testRetira() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    arvore.insere(item1);
    arvore.insere(item2);
    assert arvore.pesquisa(item1) == item1;
    assert arvore.pesquisa(item2) == item2;
    arvore.retira(item1);
    assert arvore.pesquisa(item1) == null;
    arvore.retira(item2);
    assert arvore.pesquisa(item2) == null;
  }

  @Test
  public void testTesta() {
    ArvoreBinaria arvore = new ArvoreBinaria();
    Item item1 = new MeuItem(1);
    Item item2 = new MeuItem(2);
    Item item3 = new MeuItem(3);
    arvore.insere(item2);
    arvore.insere(item1);
    arvore.insere(item3);
    arvore.testa();
  }

  @Test
  public void testPermut() {
    Item[] vetor = new Item[3];
    vetor[0] = new MeuItem(1);
    vetor[1] = new MeuItem(2);
    vetor[2] = new MeuItem(3);
    PermutacaoRandomica.permut(vetor, vetor.length);
    assert vetor[0] != null;
    assert vetor[1] != null;
    assert vetor[2] != null;
  }
}