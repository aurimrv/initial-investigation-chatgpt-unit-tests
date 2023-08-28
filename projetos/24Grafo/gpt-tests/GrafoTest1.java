
package ds;Here are some test cases for the Grafo Java class:

1. Test case for insereAresta method:
   - Create a Grafo object.
   - Call the insereAresta method with v1 = 0, v2 = 1, and peso = 5.
   - Assert that the value of mat[0][1] is 5.

2. Test case for existeAresta method:
   - Create a Grafo object.
   - Set the value of mat[2][3] to 7.
   - Call the existeAresta method with v1 = 2 and v2 = 3.
   - Assert that the returned value is true.
   - Call the existeAresta method with v1 = 3 and v2 = 2.
   - Assert that the returned value is false.

3. Test case for listaAdjVazia method:
   - Create a Grafo object.
   - Call the listaAdjVazia method with v = 4.
   - Assert that the returned value is true.
   - Set the value of mat[4][1] to 3.
   - Call the listaAdjVazia method with v = 4.
   - Assert that the returned value is false.

4. Test case for primeiroListaAdj method:
   - Create a Grafo object.
   - Set the value of mat[2][1] to 5.
   - Call the primeiroListaAdj method with v = 2.
   - Assert that the returned Aresta object has v1 = 2, v2 = 1, and peso = 5.

5. Test case for proxAdj method:
   - Create a Grafo object.
   - Set the value of mat[1][2] to 4.
   - Set the value of mat[1][3] to 6.
   - Call the proxAdj method with v = 1.
   - Assert that the returned Aresta object has v1 = 1, v2 = 2, and peso = 4.
   - Call the proxAdj method again.
   - Assert that the returned Aresta object has v1 = 1, v2 = 3, and peso = 6.
   - Call the proxAdj method again.
   - Assert that the returned value is null.

6. Test case for retiraAresta method:
   - Create a Grafo object.
   - Set the value of mat[3][2] to 8.
   - Call the retiraAresta method with v1 = 3 and v2 = 2.
   - Assert that the returned Aresta object has v1 = 3, v2 = 2, and peso = 8.
   - Assert that the value of mat[3][2] is now 0.

Note: These test cases assume that the Grafo class is functioning correctly and the methods are implemented as expected.