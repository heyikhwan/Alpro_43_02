//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch07;

public class c_AlgoritmaCocktailShakerSort {
    void cocktailSort(int[] arrAngka) {
        boolean swap = true;
        int indexStart = 0;
        int indexEnd = arrAngka.length;

        while (swap) {
            swap = false;

            for (int i = indexStart; i < indexEnd - 1; ++i) {
                if (arrAngka[i] > arrAngka[i + 1]) {
                    int temp = arrAngka[i];
                    arrAngka[i] = arrAngka[i + 1];
                    arrAngka[i + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }

            swap = false;

            indexEnd = indexEnd - 1;

            for (int i = indexEnd - 1; i >= indexStart; i--) {
                if (arrAngka[i] > arrAngka[i + 1]) {
                    int temp = arrAngka[i];
                    arrAngka[i] = arrAngka[i + 1];
                    arrAngka[i + 1] = temp;
                    swap = true;
                }
            }

            indexStart = indexStart + 1;
        }
    }

    static void cetakArray(int[] arrAngka) {
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        c_AlgoritmaCocktailShakerSort cSSort = new c_AlgoritmaCocktailShakerSort();

        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        cSSort.cocktailSort(koleksiAngka);

        System.out.print("Meng-urutkan Array | Algoritma Cocktail Shaker Sort\n[ ");
        cetakArray(koleksiAngka);
        System.out.println("]");
    }
}