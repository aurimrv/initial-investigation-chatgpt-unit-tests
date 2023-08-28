
package ds;Test Case 1:
java
package ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestaFPHeapMax {
  
  @Test
  public void testMain() {
    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
    FPHeapMax A = new FPHeapMax (20);
    int n = 7;
    MeuItem V[] = new MeuItem[n + 1];
    
    try {
      V[1] = new MeuItem (20);
      V[2] = new MeuItem (15);
      V[3] = new MeuItem (18);
      V[4] = new MeuItem (10);
      V[5] = new MeuItem (12);
      V[6] = new MeuItem (9);
      V[7] = new MeuItem (13);
      
      A.copia (V);
      A.constroi ();
      
      assertEquals("Desordenado: 20 15 18 10 12 9 13 ", A.imprime ());
      
      assertEquals("Constroi   : 20 18 15 10 12 9 13 ", A.imprime ());
      
      MeuItem x = new MeuItem (13);
      A.insere (x);
      
      assertEquals("Insere 13: 20 18 13 10