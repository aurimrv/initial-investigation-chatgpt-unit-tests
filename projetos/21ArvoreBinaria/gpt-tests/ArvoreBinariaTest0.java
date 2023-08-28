
package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import ds.PermutacaoRandomica;

public class ArvoreBinariaTest0 {
    
    @Test
    public void testInsercao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
        
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }
    
    @Test
    public void testRemocao() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);
        
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
        
        arvore.retira(item2);
        
        assertNull(arvore.pesquisa(item2));
    }
    
    @Test
    public void testPermutacaoRandomica() {
        Item[] vetor = new Item[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new MeuItem(i);
        }
        
        PermutacaoRandomica.permut(vetor, vetor.length);
        
        for (int i = 0; i < vetor.length; i++) {
            assertNotNull(arvore.pesquisa(vetor[i]));
        }
    }

}