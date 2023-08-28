
package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FPHeapMaxTest1 {

  @Test
  public void testMain() {
    String[] argv = {"7"};
    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
    FPHeapMax A = new FPHeapMax (20);
    int n;
    if (argv.length != 1)
      help ();
    n = Integer.parseInt (argv[0]);
    MeuItem V[] = new MeuItem[n + 1];
    try {
      for (int i = 1; i <= n; i++)
        V[i] = new MeuItem (Integer.parseInt (in.readLine ()));
      A.copia (V);
      System.out.print ("Desordenado: ");
      A.imprime ();
      System.out.print ("Constroi   : ");
      A.constroi ();
      A.imprime ();
      MeuItem x = new MeuItem (13);
      System.out.print ("Insere " + x.toString () + ": ");
      A.insere (x);
      A.imprime ();
      x = (MeuItem) A.max ();
      assertEquals("Max:13", "Max:" + x.toString ());
      x = (MeuItem) A.retiraMax ();
      System.out.print ("Retira" + x.toString () + ": ");
      A.imprime ();
    } catch (Exception e) {
      System.out.println("FAILED");
    }
  }
}