//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch06;

public class c_AlgoritmaSelectionSort {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Meng-urutkan angka menggunakan Algoritma Selection Sort\n[ ");

        for (int i = 0; i < koleksiAngka.length - 1; i++){
            int nilaiTerkecil = koleksiAngka[i];
            int indexNilaiTerkecil = i;

            for(int j = i + 1; j < koleksiAngka.length; j++){
                if(nilaiTerkecil > koleksiAngka[j]){
                    nilaiTerkecil = koleksiAngka[j];
                    indexNilaiTerkecil = j;
                }
            }

            if(indexNilaiTerkecil != i){
                koleksiAngka[indexNilaiTerkecil] = koleksiAngka [i];
                koleksiAngka[i] = nilaiTerkecil;
            }
        }

        for(int i = 0; i < koleksiAngka.length; i++){
            System.out.print(koleksiAngka[i] + " ");
        }

        System.out.println("]");

    }
}