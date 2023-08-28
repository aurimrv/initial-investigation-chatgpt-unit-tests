package ds;

public class Grafo {
  
  private int mat[][]; // @{\it pesos do tipo inteiro}@
  private int numVertices;
  private int pos[]; // @{\it posi\c{c}\~ao atual ao se percorrer os adjs de um v\'ertice v}@

  public Grafo () {
	final int  numVertices = 100;
    this.mat = new int[numVertices][numVertices];
    this.pos = new int[numVertices]; 
    this.numVertices = numVertices; 
    for (int i = 0; i < this.numVertices; i++) {
      for (int j = 0; j < this.numVertices; j++) this.mat[i][j] = 0;
      this.pos[i] = -1; 
    }
  }
  
  public void insereAresta (int v1, int v2, int peso) {
    this.mat[v1][v2] = peso; 
  }
  public boolean existeAresta (int v1, int v2) {
    return (this.mat[v1][v2] > 0);
  }
  public boolean listaAdjVazia (int v) {
    for (int i =0; i < this.numVertices; i++)
      if (this.mat[v][i] > 0) return false;
    return true;
  }
  public Aresta primeiroListaAdj (int v) {
    this.pos[v] = -1; return this.proxAdj (v);
  }
  public Aresta proxAdj (int v) {
    this.pos[v] ++;
    while ((this.pos[v] < this.numVertices) && 
           (this.mat[v][this.pos[v]] == 0)) this.pos[v]++;
    if (this.pos[v] == this.numVertices) return null;
    else return new Aresta (v, this.pos[v], this.mat[v][this.pos[v]]);
  }
  public Aresta retiraAresta (int v1, int v2) {
    if (this.mat[v1][v2] == 0) return null;
    else {
      Aresta aresta = new Aresta (v1, v2, this.mat[v1][v2]);
      this.mat[v1][v2] = 0; return aresta;
    }
  }
  public void imprime () {
    System.out.print ("   ");
    for (int i = 0; i < this.numVertices; i++) 
      System.out.print (i + "   "); 
    System.out.println ();
    for (int i = 0; i < this.numVertices; i++) { 
      System.out.print (i + "  ");
      for (int j = 0; j < this.numVertices; j++)
        System.out.print (this.mat[i][j] + "   ");
      System.out.println ();
    }
  }

  public Grafo grafoTransposto () {
    Grafo grafoT = new Grafo (); 
    for (int v = 0; v < this.numVertices; v++)
      if (!this.listaAdjVazia (v)) {
        Aresta adj = this.primeiroListaAdj (v);
        while (adj != null) {
          grafoT.insereAresta (adj.v2 (), adj.v1 (), adj.peso ());
          adj = this.proxAdj (v);
        }
      }
    return grafoT;
  }
}
