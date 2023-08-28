
package ds;Here are some test cases for the AgmPrim Java class:

1. Test case for the constructor of FPHeapMinIndireto:
   - Test input: double[] p = {1.0, 2.0, 3.0}, int[] v = {1, 2, 3}
   - Expected output: The object should be created with p = {1.0, 2.0, 3.0}, fp = {1, 2, 3}, n = 2, and pos = {1, 2}

2. Test case for the refaz method of FPHeapMinIndireto:
   - Test input: esq = 1, dir = 2
   - Expected output: The fp array should be rearranged correctly according to the given indices

3. Test case for the constroi method of FPHeapMinIndireto:
   - Test input: None
   - Expected output: The fp array should be rearranged in a way that satisfies the heap property

4. Test case for the retiraMin method of FPHeapMinIndireto:
   - Test input: None
   - Expected output: The minimum value in the fp array should be removed and returned

5. Test case for the diminuiChave method of FPHeapMinIndireto:
   - Test input: i = 2, chaveNova = 0.5
   - Expected output: The value at index 2 in the fp array should be updated with chaveNova and the heap property should be maintained

6. Test case for the vazio method of FPHeapMinIndireto:
   - Test input: None
   - Expected output: True if the heap is empty (n == 0), False otherwise

7. Test case for the imprime method of FPHeapMinIndireto:
   - Test input: None
   - Expected output: The p array should be printed

8. Test case for the constructor of AgmPrim:
   - Test input: Grafo grafo = new Grafo(3)
   - Expected output: The object should be created with grafo = Grafo object

9. Test case for the obterAgm method of AgmPrim:
   - Test input: raiz = 0
   - Expected output: The antecessor array and p array should be updated with the correct values for the minimum spanning tree

10. Test case for the antecessor method of AgmPrim:
    - Test input: u = 1
    - Expected output: The antecessor of vertex 1 should be returned

11. Test case for the peso method of AgmPrim:
    - Test input: u = 2
    - Expected output: The weight of vertex 2 should be returned

12. Test case for the imprime method of AgmPrim:
    - Test input: None
    - Expected output: The minimum spanning tree should be printed

13. Test case for the constructor of Grafo:
    - Test input: numVertices = 4
    - Expected output: The object should be created with an empty adjacency list of size 4

14. Test case for the insereAresta method of Grafo:
    - Test input: v1 = 0, v2 = 1, peso = 2
    - Expected output: An edge with v1 = 0, v2 = 1, and peso = 2 should be inserted into the adjacency list

15. Test case for the existeAresta method of Grafo:
    - Test input: v1 = 0, v2 = 1
    - Expected output: True if there is an edge between vertex 0 and vertex 1, False otherwise

16. Test case for the listaAdjVazia method of Grafo:
    - Test input: v = 2
    - Expected output: True if the adjacency list of vertex 2 is empty, False otherwise

17. Test case for the primeiroListaAdj method of Grafo:
    - Test input: v = 1
    - Expected output: The first edge that the vertex 1 participates in should be returned

18. Test case for the proxAdj method of Grafo:
    - Test input: v = 1
    - Expected output: The next edge that the vertex 1 participates in should be returned

19. Test case for the retiraAresta method of Grafo:
    - Test input: v1 = 0, v2 = 1
    - Expected output: The edge between vertex 0 and vertex 1 should be removed and returned

20. Test case for the numVertices method of Grafo:
    - Test input: None
    - Expected output: The number of vertices in the graph should be returned