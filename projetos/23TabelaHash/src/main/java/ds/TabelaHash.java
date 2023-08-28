package ds;
public class TabelaHash {
  private static class Celula {
    String chave; Object item; boolean retirado;
    public Celula (String chave, Object item) {
      this.chave = chave; this.item = item;
      this.retirado = false;
    }
    public boolean equals (Object obj) {
      Celula cel = (Celula)obj;
      return chave.equals (cel.chave);
    }
    public String toString () {
      return "  " + item.toString ();
    }
  }
  private int M; // @{\it tamanho da tabela}@
  private Celula tabela[];
  private int pesos[];

  private int[] geraPesos (int n) {
    int p[] = new int[n];
    java.util.Random rand = new java.util.Random ();
    for (int i = 0; i < n; i++) p[i] = rand.nextInt(M) + 1;
    return p;
  }

  private int h (String chave, int[] pesos) {
    int soma = 0;
    for (int i = 0; i < chave.length(); i++) 
      soma = soma + ((int)chave.charAt (i)) * pesos[i]; 
    return soma % this.M;
  }
  
  public TabelaHash () { // alterado para ficar com parametros estaticos assim como o programa procedimental
	  int m=7;
	  int maxTamChave=11;
    this.M = m; this.tabela = new Celula[this.M];
    for (int i = 0; i < this.M; i++) this.tabela[i] = null; // @{\it vazio}@
    this.pesos = this.geraPesos (maxTamChave);
  }  
   
  private int pesquisaIndice (String chave) {
    int inicial = this.h (chave, this.pesos);
    int indice = inicial; int i = 0;
    while (this.tabela[indice] != null &&
           !chave.equals (this.tabela[indice].chave) &&
           i < this.M)  indice = (inicial + (++i)) % this.M; 
    if (this.tabela[indice] != null && 
        chave.equals (this.tabela[indice].chave)) return indice;
    else return this.M;   // @{\it pesquisa sem sucesso}@
  }
  
  public Object pesquisa (String chave) {
    int indice = this.pesquisaIndice (chave);
    if (indice < this.M) return this.tabela[indice].item;
    else return null;   // @{\it pesquisa sem sucesso}@
  }
  
  public void insere (String chave, Object item) {
    if (this.pesquisa (chave) == null) {
      int inicial = this.h (chave, this.pesos);
      int indice = inicial; int i = 0;
      while (this.tabela[indice] != null &&
             !this.tabela[indice].retirado &&
             i < this.M) indice = (inicial + (++i)) % this.M;
      if (i < this.M) this.tabela[indice] = new Celula (chave, item);
      else System.out.println ("Tabela cheia");      
    } else System.out.println ("Registro ja esta presente");    
  }
  
  public void retira (String chave) throws Exception {
    int i = this.pesquisaIndice (chave);
    if (i < this.M) {
      this.tabela[i].retirado = true; this.tabela[i].chave = null;
    } else System.out.println ("Registro nao esta presente");
  }
   
  public Object[] recuperaItens () {
    int n = 0;
    for (int i = 0; i < this.M; i++)
      if (this.tabela[i] != null && !this.tabela[i].retirado) n++;
    Object itens[] = new Object[n]; n = 0;
    for (int i = 0; i < this.M; i++)
      if (this.tabela[i] != null && !this.tabela[i].retirado) 
        itens[n++] = this.tabela[i].item;   
    return itens;
  }
  public void imprime () {
    for (int i = 0; i < this.M; i++) {
      if (this.tabela[i] != null && !this.tabela[i].retirado) {
        System.out.println ("Entrada["+i+"]:" + this.tabela[i]); 
      }
    }
  }
}
