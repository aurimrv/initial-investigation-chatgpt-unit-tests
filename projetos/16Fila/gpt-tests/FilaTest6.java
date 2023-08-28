
package ds;Here are some possible test cases for the Fila Java class:

1. Test enfileira() when the queue is empty:
   - Input: Object x = "Test";
   - Expected Output: The queue should contain only "Test".

2. Test enfileira() when the queue is not empty:
   - Input: Object x = "Test";
             enqueue("Item1");
             enqueue("Item2");
   - Expected Output: The queue should contain "Item1", "Item2", and "Test".

3. Test desenfileira() when the queue is not empty:
   - Input: enqueue("Item1");
             enqueue("Item2");
   - Expected Output: The first item on the queue ("Item1") should be removed and returned.

4. Test desenfileira() when the queue is empty:
   - Input: No items on the queue.
   - Expected Output: An exception should be thrown with the message "Erro: A fila esta vazia".

5. Test vazia() when the queue is empty:
   - Input: No items on the queue.
   - Expected Output: The method should return true.

6. Test vazia() when the queue is not empty:
   - Input: enqueue("Item1");
             enqueue("Item2");
   - Expected Output: The method should return false.

7. Test imprime() when the queue is empty:
   - Input: No items on the queue.
   - Expected Output: The method should print nothing (an empty line).

8. Test imprime() when the queue is not empty:
   - Input: enqueue("Item1");
             enqueue(123);
             enqueue(true);
   - Expected Output: The method should print "Item1 123 true" (each item separated by a space) followed by a new line.