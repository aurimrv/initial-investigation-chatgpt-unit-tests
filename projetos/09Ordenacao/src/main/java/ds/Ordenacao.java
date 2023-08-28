package ds;
public class Ordenacao {
  private static void merge (int v[], int i, int m, int j) {
    int temp[] = new int [m-i+1];
    int k;
    for (k = i; k <= m; k++) temp[k-i] = v[k];
    int esq = 0, dir = m + 1;
    k = m-i+1;
    while (esq < k && dir <= j) {
      if (temp[esq] <= v[dir]) v[i++] = temp[esq++];
      else v[i++] = v[dir++];
    }   
    while (esq < k) v[i++] = temp[esq++];
  }
  public static void mergeSort (int v[], int i, int j) {
    if (i < j) {
      int m = (i + j)/2;
      mergeSort (v, i, m);
      mergeSort (v, m + 1, j);
      merge (v, i, m, j); // Intercala @v@[i..m] e @v@[m+1..j] em @v@[i..j] 
    }
  }
}
