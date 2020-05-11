//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch08;

public class c_AlgoritmaKnuthMorrisPratt {
    public static void main(String[] args) {
        String teks = "Indonesia tanah air beta";
        String cari = "beta";
        new c_AlgoritmaKnuthMorrisPratt().KMPSearch(cari, teks);
    }

    void KMPSearch(String pola, String teks) {
        int M = pola.length();
        int N = teks.length();

        int[] lps = new int[M];
        int j = 0;

        computeLPSArray(pola, M, lps);

        int i = 0;
        while (i < N) {
            if (pola.charAt(j) == teks.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Pola ditemukan pada index ke =  " + (i - j));
                j = lps[j - 1];
            } else if (i < N && pola.charAt(j) != teks.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }

    void computeLPSArray(String pola, int M, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pola.charAt(i) == pola.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}