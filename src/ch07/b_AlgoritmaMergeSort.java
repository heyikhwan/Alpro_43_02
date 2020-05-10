//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch07;

public class b_AlgoritmaMergeSort {
    void merge(int[] arrAngka, int leftIndex, int middleIndex, int rightIndex) {

        int n1 = middleIndex - leftIndex + 1;
        int n2 = rightIndex - middleIndex;


        int[] L = new int [n1];
        int[] R = new int [n2];


        for (int i = 0; i < n1; ++i) {
            L[i] = arrAngka[leftIndex + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arrAngka[middleIndex + 1 + j];
        }


        int i = 0, j = 0;


        int k = leftIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arrAngka[k] = L[i];
                i++;
            } else {
                    arrAngka[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arrAngka[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arrAngka[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int[] arrAngka, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex)/2;

            sort(arrAngka, leftIndex, middleIndex);
            sort(arrAngka , middleIndex+1, rightIndex);

            merge(arrAngka, leftIndex, middleIndex, rightIndex);
        }
    }

    static void cetakArray(int[] arrAngka) {
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        b_AlgoritmaMergeSort mergeSort = new b_AlgoritmaMergeSort();
        mergeSort.sort(koleksiAngka, 0, koleksiAngka.length-1);

        System.out.print("Meng-urutkan Array | Algoritma Merge Sort\n[ ");
        cetakArray(koleksiAngka);
        System.out.println("]");
    }
}