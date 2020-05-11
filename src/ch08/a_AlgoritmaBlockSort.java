//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch08;

public class a_AlgoritmaBlockSort {
    public static void main(String[] args) {
        String S1 = "SURABAYA";
        String S2 = "SURAKARTA";

        int s1Lengt = S1.length();
        int s2Length = S2.length();

        System.out.println("Panjang dari Longest Common Substring adalah "
                + LCSubStr(S1.toCharArray(), S2.toCharArray(), s1Lengt, s2Length));
    }

    static int LCSubStr(char X[], char Y[], int m, int n) {
        int LCStuff[][] = new int[m + 1][n + 1];
        int hasil = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    LCStuff[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    hasil = Integer.max(hasil, LCStuff[i][j]);
                } else{
                    LCStuff[i][j] = 0;
                }
            }
        }
        return hasil;
    }

}