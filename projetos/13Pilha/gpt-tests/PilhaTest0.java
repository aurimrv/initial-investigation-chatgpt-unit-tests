
package ds;Here are some test case scenarios for the Pilha Java class:

1. Test case for empilha method - when the stack is not full:
   - Input: Object x = "Test"
   - Expected output: The object "Test" is added to the top of the stack
   
2. Test case for empilha method - when the stack is full:
   - Input: Object x = "Test"
   - Expected output: Exception "Erro: A pilha esta cheia" is thrown
   
3. Test case for desempilha method - when the stack is not empty:
   - Input: None
   - Expected output: The top element of the stack is removed and returned
   
4. Test case for desempilha method - when the stack is empty:
   - Input: None
   - Expected output: Exception "Erro: A pilha esta vazia" is thrown
   
5. Test case for vazia method - when the stack is empty:
   - Input: None
   - Expected output: true
   
6. Test case for vazia method - when the stack is not empty:
   - Input: empilha("Test")
   - Expected output: false
   
7. Test case for tamanho method - when the stack is empty:
   - Input: None
   - Expected output: 0
   
8. Test case for tamanho method - when the stack is not empty:
   - Input: empilha("Test")
   - Expected output: 1