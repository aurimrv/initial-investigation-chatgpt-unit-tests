package ds;
public class Max { 
  public static Item max (Item v[], int n) { 
    Item max = v[0];
    for (int i = 1; i < n; i++) if (max.compara (v[i]) < 0) max = v[i];
    return max;
  }
}
