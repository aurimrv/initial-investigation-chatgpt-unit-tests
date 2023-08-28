package ds;
public class Lista {
  public Object item[];
  public int primeiro, ultimo, pos;
  // @{\it Opera\c{c}\~oes}@
  public Lista () { // @{\it Cria uma Lista vazia}@
    this.item = new Object[1000]; this.pos = -1;
    this.primeiro = 0; this.ultimo = this.primeiro;
  }

  public void insere (Object x) throws Exception {
    if (this.ultimo >= this.item.length)
      throw new Exception ("Erro: A lista esta cheia");
    else { this.item[this.ultimo] = x; this.ultimo = this.ultimo + 1; }
  }

  public boolean vazia () { return (this.primeiro == this.ultimo); }

  public void imprime () {
    for (int aux = this.primeiro; aux < this.ultimo; aux++)
      System.out.println (this.item[aux].toString ());
  }

}
