//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch06;

public class a_AlgoritmaBubbleSort {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Meng-urutkan angka menggunakan Algoritma Bubble Sort\n[ ");
        for (int i = 0; i < koleksiAngka.length; i++) {
            for (int j = 0; j < koleksiAngka.length-1; j++) {
                boolean sesuaiUrutan = koleksiAngka[j] < koleksiAngka[j+1];
                if (!sesuaiUrutan) {
                    int angkaBaru = koleksiAngka[j];
                    koleksiAngka[j] = koleksiAngka[j+1];
                    koleksiAngka[j+1] = angkaBaru;
                }
            }
        }

        for (int i = 0; i < koleksiAngka.length; i++) {
            System.out.print(koleksiAngka[i] + " ");
        }

        System.out.println("]");
    }
}