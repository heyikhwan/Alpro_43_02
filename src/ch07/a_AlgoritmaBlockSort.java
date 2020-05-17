//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch07;

public class a_AlgoritmaBlockSort {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        blocksort(koleksiAngka);

        System.out.print("Meng-urutkan Array | Algoritma Block Sort\n[ ");
        cetakArray(koleksiAngka);
        System.out.println("]");

    }

    static void blocksort(int[] koleksiAngka){
        int length = koleksiAngka.length;

        for (int i = 1; i < length; i++){
            int n = koleksiAngka[i];
            int j = i - 1;

            while ((j > -1) && (koleksiAngka[j] > n)) {
                koleksiAngka[j+1] = koleksiAngka[j];
                j--;
            }

            koleksiAngka[j+1] = n;
        }
    }

    static void cetakArray(int[] arrAngka) {
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + " ");
        }
    }
}
