package ds;
import java.io.*;
public class TestaCasamentoAproximado {
  static BufferedReader in = new BufferedReader (
                             new InputStreamReader (System.in));
  public static void help () {
    System.out.println ("Uso: java [NomePrograma] [Padrao] [k] < [Arquivo_com_texto]");
    System.exit (0);
  }
  public static void main (String[] args) throws Exception {
    if (args.length != 2) help ();
    String T = "";
    String linha = "";
    while ((linha = in.readLine()) != null) T = T + linha + "\n";
    String P = args[0];
    int k = Integer.parseInt(args[1]);
    System.out.println ("Shift-And-Aproximado:");
    CasamentoAproximado.shiftAndAproximado(T, T.length (), P, P.length (), k);
  }
}
