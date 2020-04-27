//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch06;

public class b_AlgoritmaInsertionSort {
   public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Meng-urutkan angka menggunakan Algoritma Insertion Sort\n[ ");
        for(int i = 1; i < koleksiAngka.length; i++){
            int angkaBaru = koleksiAngka[i];
            int j = i;
            while((j > 0) && (koleksiAngka[j-1] > angkaBaru)){
                koleksiAngka[j] = koleksiAngka[j-1];
                j = j - 1;
            }
            koleksiAngka[j] = angkaBaru;
        }

        for(int i = 0; i < koleksiAngka.length; i++){
            System.out.print(koleksiAngka[i] + " ");
        }

        System.out.println("]");
    }
}