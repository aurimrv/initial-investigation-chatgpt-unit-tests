
package ds;
import static org.junit.Assert.*;
import org.junit.Test;
import ds.MaxMin3;

public class MaxMin3Test8 {
  
  @Test
  public void testMaxMin3_WhenArrayIsEmpty_ReturnsNull() {
    int array[] = {};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertNull(result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasOneElement_ReturnsSingleElementArray() {
    int array[] = {5};
    int expected[] = {5, 5};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasTwoElementsInIncreasingOrder_ReturnsArrayWithMaxAndMin() {
    int array[] = {2, 4};
    int expected[] = {4, 2};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasTwoElementsInDecreasingOrder_ReturnsArrayWithMaxAndMin() {
    int array[] = {6, 3};
    int expected[] = {6, 3};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasEvenNumberOfElements_ReturnsArrayWithMaxAndMin() {
    int array[] = {9, 2, 7, 5};
    int expected[] = {9, 2};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasOddNumberOfElements_ReturnsArrayWithMaxAndMin() {
    int array[] = {8, 3, 10, 6, 4};
    int expected[] = {10, 3};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
  
  @Test
  public void testMaxMin3_WhenArrayHasRepeatedElements_ReturnsArrayWithMaxAndMin() {
    int array[] = {3, 5, 2, 4, 2, 6, 3, 6};
    int expected[] = {6, 2};
    int result[] = MaxMin3.maxMin3(array, array.length);
    assertArrayEquals(expected, result);
  }
}