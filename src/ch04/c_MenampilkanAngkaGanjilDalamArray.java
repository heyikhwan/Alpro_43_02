package ch04;

import java.util.Scanner;

public class c_MenampilkanAngkaGanjilDalamArray {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int index = 0;

        System.out.println("Angka ganjil dalam Array");
        System.out.println("------------------------");
        do {
            if (koleksiAngka[index] %2 != 0){
                System.out.println(koleksiAngka[index]);
            }

            index++;
        } while(index < koleksiAngka.length);

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}