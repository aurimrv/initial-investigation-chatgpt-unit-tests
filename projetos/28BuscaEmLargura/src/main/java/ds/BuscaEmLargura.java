package ds;

public class BuscaEmLargura {
  public static final byte branco = 0;
  public static final byte cinza  = 1;
  public static final byte preto  = 2;
  private int d[], antecessor[];
  private Grafo grafo;
  public BuscaEmLargura (Grafo grafo) {
    this.grafo = grafo; int n = this.grafo.numVertices();
    this.d = new int[n]; this.antecessor = new int[n];
  }
  private void visitaBfs (int u, int cor[]) throws Exception {
    cor[u] = cinza; this.d[u] = 0;
    Fila fila = new Fila (); fila.enfileira (new Integer (u));
//    System.out.print ("Visita origem:"+u+" cor: cinza F:");
//    fila.imprime ();
    while (!fila.vazia ()) {
      Integer aux = (Integer)fila.desenfileira (); u = aux.intValue(); 
      if (!this.grafo.listaAdjVazia (u)) {
        Grafo.Aresta a = this.grafo.primeiroListaAdj (u);
        while (a != null) {
          int v = a.v2 ();
          if (cor[v] == branco) {
            cor[v] = cinza; this.d[v] = this.d[u] + 1;
            this.antecessor[v] = u; fila.enfileira (new Integer (v));
          }
          a = this.grafo.proxAdj (u);
        }
      }
      cor[u] = preto;
      System.out.print("Visita "+u+" dist: "+this.d[u]+" cor: preto F:");
      fila.imprime ();
    }
  }
  public void buscaEmLargura () throws Exception {
    int cor[] = new int[this.grafo.numVertices ()]; 
    for (int u = 0; u < grafo.numVertices (); u++) {
      cor[u] = branco; this.d[u] = Integer.MAX_VALUE; 
      this.antecessor[u] = -1;
    }     
    for (int u = 0; u < grafo.numVertices (); u++)
      if (cor[u] == branco) this.visitaBfs (u, cor);
  }
  public int d (int v) { return this.d[v]; }
  public int antecessor (int v) { return this.antecessor[v]; }  
  public void imprimeCaminho (int origem, int v) {
    if (origem == v) System.out.println (origem);
    else if (this.antecessor[v] == -1) 
      System.out.println ("Nao existe caminho de " + origem + " ate " + v);
    else {
      imprimeCaminho (origem, this.antecessor[v]);
      System.out.println (v);
    }    
  }
}