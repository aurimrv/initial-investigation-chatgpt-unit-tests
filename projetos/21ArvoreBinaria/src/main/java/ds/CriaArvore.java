package ds;
import java.io.*;
public class CriaArvore {
  public static void main (String[] args) throws Exception {
    ArvoreBinaria dicionario = new ArvoreBinaria ();
    BufferedReader in = new BufferedReader (
                        new InputStreamReader (System.in));
    int chave = Integer.parseInt (in.readLine());
    while (chave > 0) {
      MeuItem item = new MeuItem (chave);
      dicionario.insere (item);
      chave = Integer.parseInt (in.readLine());
    }
  }
}
