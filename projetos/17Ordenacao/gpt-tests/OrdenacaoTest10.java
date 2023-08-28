
package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

public class OrdenacaoTest10 {

    @Test
    public void testPermut() {
        int tam = 5;
        int n = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        for (int i = 1; i <= n; i++) v[i] = new MeuItem (i);
        PermutacaoRandomica.permut(v, n);
        for (int i = 1; i <= n; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testSelecao() {
        int tam = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);

        Ordenacao.selecao(v, tam);

        for (int i = 1; i <= tam; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testInsercao() {
        int tam = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);

        Ordenacao.insercao(v, tam);

        for (int i = 1; i <= tam; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testShellsort() {
        int tam = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);

        Ordenacao.shellsort(v, tam);

        for (int i = 1; i <= tam; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testQuicksort() {
        int tam = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);

        Ordenacao.quicksort(v, tam);

        for (int i = 1; i <= tam; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }

    @Test
    public void testHeapsort() {
        int tam = 5;
        MeuItem v[] = new MeuItem[tam + 1];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(4);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);

        Ordenacao.heapsort(v, tam);

        for (int i = 1; i <= tam; i++) {
            assertEquals(i, v[i].recuperaChave());
        }
    }
}