package ds; 
public class MaxMin1 {
  public static int [] maxMin1 (int v[], int n) {
    int max = v[0], min = v[0]; 
    for (int i = 1; i < n; i++) {
      if (v[i] > max) max = v[i];
      if (v[i] < min) min = v[i];
    }
    int maxMin[] = new int[2]; 
    maxMin[0] = max; maxMin[1] = min;
    return maxMin;
  }
}
