package ds;
public class MeuItem implements Item {
  public int chave;
  // @{\it outros componentes do registro}@
 
  public MeuItem (int chave) { this.chave = chave; } 
  
  public int compara (Item it) {
    MeuItem item = (MeuItem) it;
    if (this.chave < item.chave) return -1;
    else if (this.chave > item.chave) return 1;
    return 0;
  }
}
