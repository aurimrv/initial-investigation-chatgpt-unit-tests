package ds;

public class TestaOrdenacao {
  public static void copia (Item fonte[], Item destino[], int n) {
    for (int i = 1; i <= n; i++)
      destino[i] = fonte[i];
  }

  public static void testa (Item v[], int n) {
    for (int i = 2; i <= n; i++) {
      if (v[i].compara (v[i - 1]) < 0) {
        System.out.print ("ERRO: ");
        imprime (v, n);
        return;
      }
    }
    System.out.print ("OK: ");
    imprime (v, n);
  }

  public static void imprime (Item v[], int n) {
    for (int i = 1; i <= n; i++)
      System.out.print (v[i].toString () + " ");
    System.out.println ();
  }

  public static void main (String[] args) {
    int tam = 20;
    MeuItem a[] = new MeuItem[tam + 1];
    MeuItem b[] = new MeuItem[tam + 1];
    int n = 20; /* Tamanho do arranjo a ser ordenado */
    for (int i = 1; i <= n; i++)
      a[i] = new MeuItem (i);
    PermutacaoRandomica.permut (a, n);
    copia (a, b, n);
    System.out.print ("Desordenado : ");
    imprime (a, n);
    System.out.print ("Selecao   ");
    Ordenacao.selecao (b, n);
    testa (b, n);
    copia (a, b, n);
    System.out.print ("Insercao  ");
    Ordenacao.insercao (b, n);
    testa (b, n);
    copia (a, b, n);
    System.out.print ("Shellsort ");
    Ordenacao.shellsort (b, n);
    testa (b, n);
    copia (a, b, n);
    System.out.print ("Quicksort ");
    Ordenacao.quicksort (b, n);
    testa (b, n);
    copia (a, b, n);
    System.out.print ("Heapsort  ");
    Ordenacao.heapsort (b, n);
    testa (b, n);
    copia (a, b, n);
    System.out.print ("BuscaBin  ");
    Ordenacao.ordenaPorInsercaoComBuscaBinaria (b, n);
    testa (b, n);
  }
}
