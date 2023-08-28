package ds;
public class Pilha {
  public Object item[];
  public int    topo;
  // @{\it Opera\c{c}\~oes}@
  public Pilha () { // @{\it Cria uma Pilha vazia}@
    this.item = new Object[1000]; this.topo = 0;
  }
  public void empilha (Object x) throws Exception {//2
    if (this.topo == this.item.length)
      throw new Exception ("Erro: A pilha esta cheia");
    else this.item[this.topo++] = x;
  }
  public Object desempilha () throws Exception {//1
    if (this.vazia())
      throw new Exception ("Erro: A pilha esta vazia");    
    return this.item[--this.topo];
  }
  public boolean vazia () {//0
    return (this.topo == 0);
  }
  public int tamanho () {
    return this.topo;
  } 
}
