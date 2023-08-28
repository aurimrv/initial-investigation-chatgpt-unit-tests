
package ds;import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxMin3Test7 {

   @Test
   public void testMaxMin3() {
      int[] input1 = {1, 2, 3, 4, 5};
      int[] expected1 = {5, 1};
      assertArrayEquals(expected1, MaxMin3.maxMin3(input1, input1.length));

      int[] input2 = {5, 4, 3, 2, 1};
      int[] expected2 = {5, 1};
      assertArrayEquals(expected2, MaxMin3.maxMin3(input2, input2.length));

      int[] input3 = {2, 1, 3, 4, 5};
      int[] expected3 = {5, 1};
      assertArrayEquals(expected3, MaxMin3.maxMin3(input3, input3.length));

      int[] input4 = {5, 4, 1, 2, 3};
      int[] expected4 = {5, 1};
      assertArrayEquals(expected4, MaxMin3.maxMin3(input4, input4.length));

      int[] input5 = {1, 2, 3, 4};
      int[] expected5 = {4, 1};
      assertArrayEquals(expected5, MaxMin3.maxMin3(input5, input5.length));

      int[] input6 = {4, 3, 2, 1};
      int[] expected6 = {4, 1};
      assertArrayEquals(expected6, MaxMin3.maxMin3(input6, input6.length));

      int[] input7 = {2, 1, 3, 4};
      int[] expected7 = {4, 1};
      assertArrayEquals(expected7, MaxMin3.maxMin3(input7, input7.length));

      int[] input8 = {4, 3, 1, 2};
      int[] expected8 = {4, 1};
      assertArrayEquals(expected8, MaxMin3.maxMin3(input8, input8.length));
   }
}