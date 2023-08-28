package ds;
public class Ordenacao {
  public static void ordena (int v[], int n) {
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++)
        if (v[j] < v[min]) 
          min = j;
      /* @{\it Troca v[min] e v[i]}@ */
      int x = v[min]; 
      v[min] = v[i]; 
      v[i] = x;
    }
  }
}
