package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class ArvoreBinariaTest15{


    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);
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
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        arvore.retira(item2);
        
        assertEquals(item1, arvore.pesquisa(item1));
        assertNull(arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);
        MeuItem item3 = new MeuItem(3);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        
        arvore.testa();
    }
    
    @Test
    public void testPermut() {
        int tam = 20, n = 20;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem(i);
        
        PermutacaoRandomica.permut(v, n);
        
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }
    
    @Test
    public void testPermutInt() {
        int tam = 20, n = 20;
        int v[] = new int[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = i;
        
        PermutacaoRandomica.permut(v, n);
        
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i]);
        }
    }
    
    @Test
    public void testPermutChar() {
        int tam = 20, n = 20;
        char v[] = new char[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = (char)(i + 64);
        
        PermutacaoRandomica.permut(v, n);
        
        for (int i = 1; i <= n; i++) {
            assertEquals((char)(i + 64), v[i]);
        }
    }
}