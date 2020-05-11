//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch08;

public class b_AlgoritmaBooyerMoreStringSearch {
    static int NO_OF_CHARS = 256;
    public static void main(String []args) {

        char[] teks = "Algoritma Pemrograman Java UIN SUSKA RIAU".toCharArray();
        char[] cari = "Java".toCharArray();
        search(teks, cari);
    }

    static int max (int a, int b) {
        return (a > b)? a : b;
    }

    static void badCharHeuristic(char[] str, int size, int[] badchar) {
        int i;

        for (i = 0; i < NO_OF_CHARS; i++) {
            badchar[i] = -1;
        }

        for (i = 0; i < size; i++) {
            badchar[(int) str[i]] = i;
        }
    }

    static void search(char[] teks, char[] pola) {
        int m = pola.length;
        int n = teks.length;

        int[] badchar = new int[NO_OF_CHARS];

        badCharHeuristic(pola, m, badchar);

        int s = 0;

        while(s <= (n - m)) {
            int j = m-1;

            while(j >= 0 && pola[j] == teks[s+j]) {
                j--;
            }

            if (j < 0) {
                System.out.println("Pola ditemukan pada index ke = " + s);

                s += (s+m < n)? m-badchar[teks[s+m]] : 1;

            } else {

                s += max(1, j - badchar[teks[s + j]]);
            }
        }
    }

}