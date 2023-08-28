
package ds;import org.junit.Test;
import java.util.Random;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest2 {
    
    @Test
    public void testInsercao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        assertEqual(item1, arvore.pesquisa(item1));
        
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        assertEqual(item2, arvore.pesquisa(item2));
    }
    
    @Test
    public void testRemocao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }
    
    @Test
    public void testPesquisaInexistente() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        
        Item item3 = new MeuItem(3);
        assertNull(arvore.pesquisa(item3));
    }
    
    @Test
    public void testPermutacaoAleatoria() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
          vetor[i] = i;

        PermutacaoRandomica.permut(vetor, max);

        for (int i = 0; i < max; i++) { 
          x = new MeuItem(vetor[i]);
          arvore.insere(x);
          assertEquals(x, arvore.pesquisa(x));
        }
    }
    
    @Test
    public void testIntegridadeArvore() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
          vetor[i] = i;

        PermutacaoRandomica.permut(vetor, max);

        for (int i = 0; i < max; i++) { 
          x = new MeuItem(vetor[i]);
          arvore.insere(x);
          arvore.testa();
        }
    }
    
    @Test
    public void testRemocaoAleatoria() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
          vetor[i] = i;

        PermutacaoRandomica.permut(vetor, max);

        for (int i = 0; i < max; i++) {
            Random rand = new Random();
            int k =  rand.nextInt(10);
            int n = vetor[k];
            x = new MeuItem(n);
            arvore.retira(x);
            arvore.testa();
            for (int j = 0; j < max; j++) { 
              x = new MeuItem(rand.nextInt(10));
              if (x.compara(new MeuItem(n)) != 0 ) { 
                System.out.print("Pesquisando chave: " + x.toString());
                x = (MeuItem)arvore.pesquisa(x);
                System.out.println(" , encontrou:" + x.toString());
              }
            }
          x = new MeuItem(n);
          arvore.insere(x);
          arvore.testa();
        }
    }
    
    @Test
    public void testRemocaoRaiz() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int max = 10;
        MeuItem x;
        int vetor[] = new int[max];

        for (int i = 0; i < max; i++)
          vetor[i] = i;

        PermutacaoRandomica.permut(vetor, max);

        for (int i = 0; i < max; i++) { 
          x = new MeuItem(vetor[i]);
          arvore.retira(x);
          arvore.testa();
        }
    }
}