package ds;
public class Lista {
  private static class Celula { Object item; Celula prox; }
 
  private Celula primeiro, ultimo, pos;
  // @{\it Opera\c{c}\~oes}@
  public Lista () { // @{\it Cria uma Lista vazia}@
    this.primeiro = new Celula (); this.pos = this.primeiro;
    this.ultimo = this.primeiro; this.primeiro.prox = null;    
  }
  public void insere (Object x) {
    this.ultimo.prox = new Celula (); this.ultimo = this.ultimo.prox;
    this.ultimo.item = x; this.ultimo.prox = null;
  }
  public boolean vazia () { return (this.primeiro == this.ultimo); } 
  public void imprime () {
    Celula aux = this.primeiro.prox;
    while (aux != null) {
      System.out.println (aux.item.toString ()); aux = aux.prox;
    }
  }
}
