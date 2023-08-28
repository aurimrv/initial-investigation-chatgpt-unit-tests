package ds;
public class CasamentoExato {
  private static final int maxChar = 256;
  public static void forcaBruta (String T, int n, String P, int m) {
    // @{\it Pesquisa P[0..m-1] em T[0..n-1]}@
    for (int i = 0; i < (n - m + 1); i ++) {
      int k = i; int j = 0;
      while ((j < m) && (T.charAt (k) == P.charAt (j))) { j++; k++; }
      if (j == m) System.out.println ("Casamento na posicao: " + i);
    }
  }
  public static void shiftAndExato (String T, int n, String P, int m) {
    int R = 0;
    // @{\it Pr\'e-processamento do padr\~ao}@
    int M[] = new int[maxChar];
    for (int i = 0; i < maxChar; i++) M[i] = 0;
    for (int j = 0; j < m; j++) 
      M[(int)P.charAt (j)] = M[(int)P.charAt (j)] | (1 << (m - j - 1));
    // @{\it Pesquisa}@
    for (int i = 0; i < n; i++) {
      R = ((R >> 1) | (1 << (m - 1))) & M[(int)T.charAt (i)];
      if ((R & 1) != 0) 
        System.out.println ("Casamento na posicao: " + (i - m + 1));
    }
  }
  public static void bmh (String T, int n, String P, int m) {
    // @{\it Pr\'e-processamento do padr\~ao}@
    int d[] = new int[maxChar];
    for (int j = 0; j < maxChar; j++) d[j] = m;
    for (int j = 0; j < (m-1); j++) d[(int)P.charAt (j)] = m - j - 1;
    int i = m - 1;
    while (i < n) { // @{\it Pesquisa}@
      int k = i; int j = m - 1;
      while ((j >= 0) && (T.charAt (k) == P.charAt (j))) { j--; k--; }
      if (j < 0)
        System.out.println ("Casamento na posicao: " + (k + 1));
      i = i + d[(int)T.charAt (i)];
    }
  }
  public static void bmhs (String T, int n, String P, int m) {
    // @{\it Pr\'e-processamento do padr\~ao}@
    int d[] = new int[maxChar];
    for (int j = 0; j < maxChar; j++) d[j] = m + 1;
    for (int j = 0; j < m; j++) d[(int)P.charAt (j)] = m - j;
    int i = m - 1;
    while (i < n) { // @{\it Pesquisa}@
      int k = i; int j = m - 1;
      while ((j >= 0) && (T.charAt (k) == P.charAt (j))) { j--; k--; }
      if (j < 0)
        System.out.println ("Casamento na posicao: " + (k + 1));
      i += i != (n-1) ? d[(int)T.charAt (i+1)] : 1;
    }    
  }
}
