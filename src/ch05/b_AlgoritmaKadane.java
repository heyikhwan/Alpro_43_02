//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch05;

import  java.util.Scanner;

public class b_AlgoritmaKadane {
    public int cariNilaiMaximumArray(int[] nilaiArr) {
        int maxHere = 0;
        int maxFinal = 0;

        for (int i = 0; i < nilaiArr.length; i++) {
            maxHere += nilaiArr[i];
            if (maxHere < 0) {
                maxHere = 0;
            }
            if (maxFinal < maxHere) {
                maxFinal = maxHere;
            }
        }
        return maxFinal;
    }
    public static void main(String[] args) {
        int[] nilaiArr = {2, 4, -4, -2, 3, 5, -1, 7};
        b_AlgoritmaKadane nilaiMaksimum = new b_AlgoritmaKadane();

        System.out.println("****************************");
        System.out.println("MENCARI NILAI MAKSIMUM ARRAY MENGGUNAKAN ALGORITMA KADANE");
        System.out.println("****************************");
        System.out.println("Nilai Maksimum dari subarray adalah  " + nilaiMaksimum.cariNilaiMaximumArray(nilaiArr));
    }
}