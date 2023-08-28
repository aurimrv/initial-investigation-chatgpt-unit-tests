package ds;

public class Tabela {
  public Item registros[];
  public int n;
  
  public Tabela () {
	final int maxN = 10;
    this.registros = new Item[maxN+1];
    this.n = 0;
  }
  public int pesquisa (Item reg) {
    this.registros[0] = reg; // @{\it sentinela}@
    int i = this.n; 
    while (this.registros[i].compara (reg) != 0) i--;
    return i;
  }
  public void insere (Item reg) throws Exception {
    if (this.n == (this.registros.length - 1))
      throw new Exception ("Erro: A tabela esta cheia");
    this.registros[++this.n] = reg;
  }
  public int binaria (Item chave) { 
    if (this.n == 0) return 0;
    int esq = 1, dir = this.n, i;
    do { 
      i = (esq + dir) / 2;
      if (chave.compara (this.registros[i]) > 0) esq = i + 1;
      else dir = i - 1;
    } while ((chave.compara (this.registros[i]) != 0) && (esq <= dir));
    if (chave.compara (this.registros[i]) == 0) return i;
    else return 0;
  }
 
}
