package ds;
public class Fila {
  private static class Celula {
    Object item;
    Celula prox;
  }
  private Celula frente;
  private Celula tras;
  // @{\it Opera\c{c}\~oes}@
  public Fila () { // @{\it Cria uma Fila vazia}@
    this.frente = new Celula ();
    this.tras = this.frente;
    this.frente.prox = null;
  }
  public void enfileira (Object x) {
    this.tras.prox = new Celula ();
    this.tras = this.tras.prox;
    this.tras.item = x;
    this.tras.prox = null;
  }
  public Object desenfileira () throws Exception {
    Object item = null;
    if (this.vazia ())
      throw new Exception ("Erro: A fila esta vazia");
    this.frente = this.frente.prox;
    item = this.frente.item;
    return item;
  }

  public boolean vazia () {
    return (this.frente == this.tras);
  }
  public void imprime () {
    Celula aux; aux = this.frente.prox;
    while (aux != null) {
      System.out.print(" " + aux.item.toString ());
      aux = aux.prox;
    }
    System.out.println ();
  }
}
