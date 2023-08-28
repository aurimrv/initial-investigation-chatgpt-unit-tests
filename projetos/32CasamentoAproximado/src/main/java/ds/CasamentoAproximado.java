package ds;
public class CasamentoAproximado {
  private static final int maxChar = 256;
  public static void shiftAndAproximado (String T,int n,String P,int m, int k) {
    // @{\it Pr\'e-processamento do padr\~ao}@
    int R[] = new int[k+1];
    int M[] = new int[maxChar];
    for (int i = 0; i < maxChar; i++) M[i] = 0;
    for (int j = 0; j < m; j++) 
      M[(int)P.charAt (j)] = M[(int)P.charAt (j)] | (1 << (m-j-1));
    // @{\it Pesquisa}@
    int Ri =  1 << (m-1); R[0] = 0;
    for (int j = 1; j <= k; j++) R[j] = (1 << (m-j)) | R[j-1];
    for (int i = 0; i < n; i++) {
      int Rant = R[0];
      int RNovo = ((Rant >> 1) | Ri) & M[(int)T.charAt (i)];
      R[0] = RNovo;
      for (int j = 1; j <= k; j++) {
        RNovo = ((R[j] >> 1) & M[(int)T.charAt (i)]) | Rant | 
                ((Rant | RNovo) >> 1);
        Rant = R[j];
        R[j] = RNovo | Ri;
      }      
      if ((RNovo & 1) != 0) 
        System.out.println ("Casamento na posicao: " + T.charAt(i));
    }
  }
}
