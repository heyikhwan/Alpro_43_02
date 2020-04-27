//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch05;

import  java.util.Scanner;

public class c_AlgoritmaLongestCommonSubsequence {
   static void lcs(String S1, String S2, int m, int n) {
        int[][] tabel_LCS = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    tabel_LCS[i][j] = 0;
                else if (S1.charAt(i - 1) == S2.charAt(j - 1))
                    tabel_LCS[i][j] = tabel_LCS[i - 1][j - 1] + 1;
                else
                    tabel_LCS[i][j] = Math.max(tabel_LCS[i - 1][j], tabel_LCS[i][j - 1]);
            }
        }

        int index = tabel_LCS[m][n];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = '\0';

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                lcs[index - 1] = S1.charAt(i - 1);

                i--;
                j--;
                index--;
            }

            else if (tabel_LCS[i - 1][j] > tabel_LCS[i][j - 1])
                i--;
            else
                j--;
        }

        System.out.print("S1 : " + S1 + "\nS2 : " + S2 + "\nLCS: ");
        for (int k = 0; k <= temp; k++) {
            System.out.print(lcs[k]);
        }
    }

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Sample 1 = ");
        String S1 = inputUser.nextLine();
        System.out.print("Masukkan Sample 2 = ");
        String S2 = inputUser.nextLine();

        int m = S1.length();
        int n = S2.length();
        lcs(S1, S2, m, n);
    }

}