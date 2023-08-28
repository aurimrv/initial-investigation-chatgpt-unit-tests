
package ds;We can generate the following test cases for the Grafo Java class:

1. Test case for the constructor:
   - Verify that the number of vertices is correctly initialized.
   - Verify that the adjacency list is correctly initialized.

2. Test case for the insereAresta method:
   - Verify that the edge is correctly inserted into the adjacency list.
   - Verify that the weight of the edge is correctly assigned.

3. Test case for the existeAresta method:
   - Verify that the method returns true when there is an edge between two vertices.
   - Verify that the method returns false when there is no edge between two vertices.

4. Test case for the listaAdjVazia method:
   - Verify that the method returns true when the adjacency list of a vertex is empty.
   - Verify that the method returns false when the adjacency list of a vertex is not empty.

5. Test case for the primeiroListaAdj method:
   - Verify that the method returns the first edge that the vertex participates in.
   - Verify that the method returns null when the adjacency list of the vertex is empty.

6. Test case for the proxAdj method:
   - Verify that the method returns the next edge that the vertex participates in.
   - Verify that the method returns null when the adjacency list of the vertex is empty or at the end.

7. Test case for the retiraAresta method:
   - Verify that the method returns the removed edge when it exists.
   - Verify that the method returns null when the edge does not exist.

8. Test case for the grafoTransposto method:
   - Verify that the transposed graph is correctly created.
   - Verify that the transposed graph has the same number of vertices as the original graph.
   - Verify that the transposed graph contains the same number of edges as the original graph.

Note: It is important to mock the necessary dependencies (such as Celula and Lista) and perform the appropriate imports of the classes used for testing.