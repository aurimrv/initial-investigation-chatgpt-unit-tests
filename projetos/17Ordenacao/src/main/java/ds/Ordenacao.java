package ds;
public class Ordenacao {
  private static class LimiteParticoes { int i; int j; }
  private static LimiteParticoes particao (Item v[], int esq, int dir) {
    LimiteParticoes p = new LimiteParticoes ();
    p.i = esq;  p.j = dir;
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
  private static void ordena (Item v[], int esq, int dir) {
    LimiteParticoes p = particao (v, esq, dir);
    if (esq < p.j) ordena (v, esq, p.j);
    if (p.i < dir) ordena (v, p.i, dir);
  }
  public static void selecao (Item v[], int n) {
    for (int i = 1; i <= n - 1; i++) {
      int min = i;
      for (int j = i + 1; j <= n; j++)
        if (v[j].compara (v[min]) < 0) min = j;
      Item x = v[min]; v[min] = v[i]; v[i] = x;
    }
  }
  public static void insercao (Item v[], int n) {
    int j;
    for (int i = 2; i <= n; i++) {
      Item x = v[i]; j = i - 1;
      v[0] = x; // @{\it sentinela}@
      while (x.compara (v[j]) < 0) {
        v[j + 1] = v[j]; j--;
      }
      v[j + 1] = x;
    }
  }

  public static void shellsort (Item v[], int n) {
    int h = 1;
    do h = h * 3 + 1; while (h < n);
    do {
      h /= 3;
      for (int i = h + 1; i <= n; i++) {
        Item x = v[i]; int j = i;
        while (v[j - h].compara (x) > 0) {
          v[j] = v[j - h]; j -= h;
          if (j <= h) break;
        }
        v[j] = x;
      }
    } while (h != 1);
  }

  public static void quicksort (Item v[], int n) { ordena (v, 1, n); }

  public static void heapsort (Item v[], int n) {
    // @{\it Usa a classe FPHeapMax do Programa~\ref{prog:fpheap}}@
    FPHeapMax fpHeap = new FPHeapMax (v);
    int dir = n;
    fpHeap.constroi (); // @{\it constroi o heap}@
    while (dir > 1) { // @{\it ordena o vetor}@
      Item x = v[1]; v[1] = v[dir]; v[dir] = x;
      dir--; fpHeap.refaz (1, dir);
    }
  }
}
