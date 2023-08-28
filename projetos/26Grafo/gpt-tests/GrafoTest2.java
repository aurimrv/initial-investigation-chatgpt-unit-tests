
package ds;Here are some test cases for the Grafo Java class:

1. Test case to check if the insereAresta method adds the edge correctly:
   - Create a Grafo object with a specified number of vertices.
   - Call the insereAresta method with valid vertex indices and a positive weight.
   - Assert that the existeAresta method returns true for the added edge.

2. Test case to check if the existeAresta method correctly detects the presence of an edge:
   - Create a Grafo object with a specified number of vertices.
   - Add some edges using the insereAresta method.
   - Call the existeAresta method with valid vertex indices for both existing and non-existing edges.
   - Assert that the method returns true for existing edges and false for non-existing edges.

3. Test case to check if the listaAdjVazia method correctly detects an empty adjacency list:
   - Create a Grafo object with a specified number of vertices.
   - Call the listaAdjVazia method for a vertex with no adjacent vertices.
   - Assert that the method returns true.

4. Test case to check if the primeiroListaAdj method returns the first adjacent edge:
   - Create a Grafo object with a specified number of vertices.
   - Add some edges using the insereAresta method.
   - Call the primeiroListaAdj method for a vertex with adjacent edges.
   - Assert that the method returns the first adjacent edge.

5. Test case to check if the proxAdj method returns the next adjacent edge:
   - Create a Grafo object with a specified number of vertices.
   - Add some edges using the insereAresta method.
   - Call the proxAdj method multiple times for a vertex with adjacent edges.
   - Assert that the method returns the next adjacent edge each time until the end of the adjacency list.

6. Test case to check if the retiraAresta method removes the edge correctly:
   - Create a Grafo object with a specified number of vertices.
   - Add some edges using the insereAresta method.
   - Call the retiraAresta method for an existing edge.
   - Assert that the method returns the removed edge and the existeAresta method returns false for the removed edge.

Note: These test cases assume that the Grafo class is imported correctly and the Junit 4 library is available for testing.