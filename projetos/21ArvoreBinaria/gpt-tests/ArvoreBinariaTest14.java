package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest14{


    @Test
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        Item item3 = new MeuItem(3);
        arvore.insere(item3);

        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));

        Item item4 = new MeuItem(4);
        assertNull(arvore.pesquisa(item4));
    }

    @Test
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        Item item3 = new MeuItem(3);
        arvore.insere(item3);

        assertEquals(item1, arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        Item item3 = new MeuItem(3);
        arvore.insere(item3);

        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
        assertEquals(item2, arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));

        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));
        assertEquals(item3, arvore.pesquisa(item3));

        arvore.retira(item3);
        assertNull(arvore.pesquisa(item3));
    }

    @Test
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        arvore.insere(item1);
        Item item2 = new MeuItem(2);
        arvore.insere(item2);
        Item item3 = new MeuItem(3);
        arvore.insere(item3);

        arvore.testa();
    }
}