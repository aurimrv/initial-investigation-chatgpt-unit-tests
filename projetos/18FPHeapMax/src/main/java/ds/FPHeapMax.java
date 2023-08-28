package ds;

public class FPHeapMax {
  private Item v[];
  private int  n;
  public FPHeapMax (int maxTam) { // @{\it Cria uma fila de prioridades vazia}@
    this.v = new Item[maxTam + 1]; this.n = 0;
  }
  public void refaz (int esq, int dir) {
    int j = esq * 2; Item x = this.v[esq];
    while (j <= dir) {
      if ((j < dir) && (this.v[j].compara (this.v[j + 1]) < 0)) j++;
      if (x.compara (this.v[j]) >= 0) break;
      this.v[esq] = this.v[j];
      esq = j; j = esq * 2;
    }
    this.v[esq] = x;
  }
  public void constroi () {
    int esq = n / 2 + 1;
    while (esq > 1) {
      esq--; this.refaz (esq, this.n);
    }
  }
  public Item max () { return this.v[1]; }
  public Item retiraMax () throws Exception {
    Item maximo;
    if (this.n < 1) throw new Exception ("Erro: heap vazio");
    else {
      maximo = this.v[1]; this.v[1] = this.v[this.n--];
      refaz (1, this.n);
    }
    return maximo;
  }
  public void aumentaChave (int i, Object chaveNova) throws Exception {
    Item x = this.v[i];
    if (chaveNova == null) 
      throw new Exception ("Erro: chaveNova com valor null");
    x.alteraChave (chaveNova);
    while ((i > 1) && (x.compara (this.v[i / 2]) >= 0)) {
      this.v[i] = this.v[i / 2]; i /= 2;
    }
    this.v[i] = x;
  }
  public void insere (Item x) throws Exception {
    this.n++;
    if (this.n == this.v.length) throw new Exception ("Erro: heap cheio");
    Object chaveNova = x.recuperaChave ();
    this.v[this.n] = x;
    this.v[this.n].alteraChave (new Integer (Integer.MIN_VALUE)); // @$-\infty$@
    this.aumentaChave (this.n, chaveNova);
  }
  public void imprime () {
    for (int i = 1; i <= this.n; i++) System.out.print (this.v[i].toString () + " ");
    System.out.println ();
  }
  
  // metodo usado apenas para copiar o vetor para o heap, ignora-lo nos testes
  public void copia (Item v[]) {
	    for (int i = 1; i < v.length; i++) this.v[++this.n] = v[i];
	  }
}
