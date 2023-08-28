
package ds;Here are some test cases for the MaxMin4 class:

1. Test when there are only two elements in the array:
   - Input: v = [5, 10], linf = 0, lsup = 1
   - Expected output: [10, 5]
   
2. Test when there are three elements in the array and lsup - linf > 1:
   - Input: v = [5, 10, 3], linf = 0, lsup = 2
   - Expected output: [10, 3]
   
3. Test when all elements in the array are equal:
   - Input: v = [7, 7, 7, 7], linf = 0, lsup = 3
   - Expected output: [7, 7]
   
4. Test when array elements are negative numbers:
   - Input: v = [-5, -10, -3, -8, -2], linf = 0, lsup = 4
   - Expected output: [-2, -10]
   
5. Test when array elements are duplicate:
   - Input: v = [2, 4, 3, 2, 3, 4, 3, 2], linf = 0, lsup = 7
   - Expected output: [4, 2]
   
6. Test when array elements are sorted in ascending order:
   - Input: v = [1, 2, 3, 4, 5], linf = 0, lsup = 4
   - Expected output: [5, 1]
   
7. Test when array elements are sorted in descending order:
   - Input: v = [5, 4, 3, 2, 1], linf = 0, lsup = 4
   - Expected output: [5, 1]