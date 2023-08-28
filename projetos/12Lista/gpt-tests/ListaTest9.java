
package ds;Here are some possible test cases for the `Lista` Java class:

1. Test case to check if the `insere` method adds an item to the list correctly:
   - Create a new `Lista` object.
   - Call the `insere` method with an object.
   - Use assertions to verify that the item was added to the list correctly.

2. Test case to check if the `vazia` method returns true for an empty list:
   - Create a new `Lista` object.
   - Use assertions to verify that the `vazia` method returns true.

3. Test case to check if the `vazia` method returns false for a non-empty list:
   - Create a new `Lista` object.
   - Call the `insere` method with an object.
   - Use assertions to verify that the `vazia` method returns false.

4. Test case to check if the `imprime` method prints the items in the list correctly:
   - Create a new `Lista` object.
   - Call the `insere` method multiple times with different objects.
   - Redirect the standard output to a `StringWriter`.
   - Call the `imprime` method.
   - Use assertions to verify that the output matches the expected output.

Note: The test cases assume that you have set up JUnit 4 and Java 8 properly and have imported the necessary packages and classes.