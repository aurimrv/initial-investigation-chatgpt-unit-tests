package ds;

public class OrdenacaoParcial {
  private static class LimiteParticoes { int i; int j; }
  private static LimiteParticoes particao (Item v[], int esq, int dir) {
    LimiteParticoes p = new LimiteParticoes ();
    p.i = esq; p.j = dir;
    Item x = v[(p.i + p.j) / 2]; // @{\it obt\'em o pivo x}@
    do {
      while (x.compara (v[p.i]) > 0) p.i++;
      while (x.compara (v[p.j]) < 0) p.j--;
      if (p.i <= p.j) {
        Item w = v[p.i]; v[p.i] = v[p.j]; v[p.j] = w;
        p.i++; p.j--;
      }
    } while (p.i <= p.j);
    return p;
  }
  private static void ordena (Item v[], int esq, int dir, int k) {
    LimiteParticoes p = particao (v, esq, dir);
    if (p.j - esq >= k - 1) {
      if (esq < p.j) ordena (v, esq, p.j, k);
      return;
    }
    if (esq < p.j) ordena (v, esq, p.j, k);
    if (p.i < dir) ordena (v, p.i, dir, k);
  }
  public static void selecaoParcial (Item v[], int n, int k) {
    for (int i = 1; i <= k; i++) {
      int min = i;
      for (int j = i + 1; j <= n; j++)
        if (v[j].compara (v[min]) < 0) min = j;
      Item x = v[min]; v[min] = v[i]; v[i] = x;
    }
  }
  public static void insercaoParcial (Item v[], int n, int k) {
    int j;
    for (int i = 2; i <= n; i++) {
      Item x = v[i];
      if (i > k) j = k; else j = i - 1;
      v[0] = x; // @{\it sentinela}
      while (x.compara (v[j]) < 0) {
        v[j + 1] = v[j]; j--;
      }
      v[j + 1] = x;
    }
  }
  public static void insercaoParcial2 (Item v[], int n, int k) { 
    int j;
    for (int i = 2; i <= n; i++) {
      Item x = v[i];
      if (i > k) {
        j = k;
        if (x.compara (v[k]) < 0) v[i] = v[k];
      }
      else j = i - 1;
      v[0] = x; // @{\it sentinela}@
      while (x.compara (v[j]) < 0) {
        if (j < k) v[j + 1] = v[j];
        j--;
      }
      if (j < k) v[j + 1] = x;
    }
  }
  public static void quicksortParcial (Item v[], int n, int k) {
    ordena (v, 1, n, k);
  }
  public static void heapsortParcial (Item v[], int n, int k) {
    // @{\it Coloca menor em v[n], segundo em v[n-1],...,k-esimo em v[n-k]}@
    FPHeapMin fpHeap = new FPHeapMin (v);
    int dir = n, aux = 0;
    fpHeap.constroi (); // @{\it constroi o heap}@
    while (aux < k) { // @{\it ordena o vetor}@
      Item x = v[1]; v[1] = v[dir]; v[dir] = x;
      dir--; aux++;
      fpHeap.refaz (1, dir);
    }
  }
}