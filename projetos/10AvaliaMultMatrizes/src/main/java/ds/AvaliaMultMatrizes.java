package ds;
import java.io.*;
public class AvaliaMultMatrizes {
 
	public static void multmatrize (int n, int d[]) throws IOException { //parametros alterados para aceitar entrada pelo junit
    int  maxn = n+1;

    int m[][] = new int[maxn][maxn];
  
    for (int i = 0; i < n; i++)  m[i][i] = 0;
    for (int h = 1; h < n; h++) { 
      for (int i = 1; i <= n - h; i++) { 
        int j = i + h;
        m[i-1][j-1] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) { 
          int temp = m[i-1][k-1] + m[k][j-1] + d[i-1] * d[k] * d[j];
          if (temp < m[i-1][j-1])  m[i-1][j-1] = temp;
        }
        System.out.print(" m[" +i+"]["+j+"]= "+ m[i-1][j-1]);
      }
      System.out.println();
    }
  }
}
