
package ds;import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.Assert;
import org.junit.Test;

public class TestaFPHeapMaxTest {
  
  @Test
  public void testMainMethod() {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    FPHeapMax A = new FPHeapMax(20);
    int n = 7;
    MeuItem[] V = new MeuItem[n + 1];
    
    try {
      V[1] = new MeuItem(20);
      V[2] = new MeuItem(15);
      V[3] = new MeuItem(18);
      V[4] = new MeuItem(10);
      V[5] = new MeuItem(12);
      V[6] = new MeuItem(9);
      V[7] = new MeuItem(13);
      
      A.copia(V);
      
      String expectedDesordenado = "20 15 18 10 12 9 13 ";
      Assert.assertEquals(expectedDesordenado, A.imprime());
      
      A.constroi();
      
      String expectedConstroi = "20 15 18 10 12 9 13 ";
      Assert.assertEquals(expectedConstroi, A.imprime());
      
      MeuItem x = new MeuItem(13);
      A.insere(x);
      
      String expectedInsere = "20 15 18 10 