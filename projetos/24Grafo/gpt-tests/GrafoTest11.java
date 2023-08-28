
package ds;Here are some test cases for the given Grafo Java class:

1. Test for insereAresta method:
- Test case description: Verify if the method inserts the edge with the correct weight
- Input: v1 = 1, v2 = 2, peso = 5
- Expected output: The weight of the edge (1, 2) should be 5

2. Test for existeAresta method:
- Test case description: Verify if the method correctly identifies the existence of an edge
- Input: v1 = 2, v2 = 3
- Expected output: The method should return false because the edge (2, 3) does not exist

3. Test for listaAdjVazia method:
- Test case description: Verify if the method correctly identifies an empty adjacency list
- Input: v = 4
- Expected output: The method should return true, indicating that the adjacency list of vertex 4 is empty

4. Test for primeiroListaAdj method:
- Test case description: Verify if the method correctly returns the first adjacent edge
- Input: v = 3
- Expected output: The method should return the Aresta object representing the first adjacent edge of vertex 3

5. Test for proxAdj method:
- Test case description: Verify if the method correctly returns the next adjacent edge
- Input: v = 1
- Expected output: The method should return the Aresta object representing the next adjacent edge of vertex 1

6. Test for retiraAresta method:
- Test case description: Verify if the method correctly removes an edge and returns it
- Input: v1 = 2, v2 = 4
- Expected output: The method should remove the edge (2, 4) and return the Aresta object representing the removed edge

7. Test for grafoTransposto method:
- Test case description: Verify if the method correctly creates and returns the transposed graph
- Input: (graph with edges (1, 2), (1, 3), (2, 3))
- Expected output: The method should return the transposed graph with edges (2, 1), (3, 1), (3, 2)

Note: These test cases cover the basic functionality of the methods in the Grafo class. Additional test cases can be added to test edge cases and handle exceptional scenarios.