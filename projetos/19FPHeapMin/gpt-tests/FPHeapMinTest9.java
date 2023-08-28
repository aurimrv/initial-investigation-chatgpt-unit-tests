
package ds;import static org.junit.Assert.*;
import org.junit.*;

public class FPHeapMinTest9 {

  @Test
  public void testConstructor1() {
    FPHeapMin fhpm = new FPHeapMin(5);
    assertNotNull(fhpm);
  }

  @Test
  public void testConstructor2() {
    Item v[] = new Item[6];
    FPHeapMin fhpm = new FPHeapMin(v);
    assertNotNull(fhpm);
  }

  @Test
  public void testRefaz() {
    Item v[] = new Item[11];
    for (int i = 1; i <= 10; i++) {
      v[i] = new MeuItem(i);
    }
    FPHeapMin fhpm = new FPHeapMin(v);
    fhpm.refaz(1, 10);
    Item min = fhpm.min();
    assertEquals(1, ((MeuItem) min).chave);
  }

  @Test
  public void testConstroi() {
    Item v[] = new Item[11];
    for (int i = 1; i <= 10; i++) {
      v[i] = new MeuItem(i);
    }
    FPHeapMin fhpm = new FPHeapMin(v);
    fhpm.constroi();
    Item min = fhpm.min();
    assertEquals(1, ((MeuItem) min).chave);
  }

  @Test
  public void testRetiraMin() throws Exception {
    Item v[] = new Item[11];
    for (int i = 1; i <= 10; i++) {
      v[i] = new MeuItem(i);
    }
    FPHeapMin fhpm = new FPHeapMin(v);
    Item min = fhpm.retiraMin();
    assertEquals(1, ((MeuItem) min).chave);
  }

  @Test
  public void testDiminuiChave() throws Exception {
    Item v[] = new Item[6];
    for (int i = 1; i <= 5; i++) {
      v[i] = new MeuItem(i);
    }
    FPHeapMin fhpm = new FPHeapMin(v);
    fhpm.diminuiChave(3, 0);
    Item min = fhpm.min();
    assertEquals(0, ((MeuItem) min).chave);
  }

  @Test
  public void testInsere() throws Exception {
    Item v[] = new Item[6];
    for (int i = 1; i <= 4; i++) {
      v[i] = new MeuItem(i);
    }
    FPHeapMin fhpm = new FPHeapMin(v);
    fhpm.insere(new MeuItem(0));
    Item min = fhpm.min();
    assertEquals(0, ((MeuItem) min).chave);
  }
}