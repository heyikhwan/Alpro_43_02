package ch04;

import java.util.Scanner;

public class b_MencariSebuahAngkaDalamArray {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int cariAngka;

        System.out.print("Cari Angka: ");
        cariAngka = inputUser.nextInt();

        int index = 0;

        do {
            if (koleksiAngka[index] == cariAngka){
                System.out.println("Angka " + koleksiAngka[index] + " ditemukan");
                return;
            } else {
                index++;
            }
        } while(index < koleksiAngka.length);

        System.out.println("Angka " + cariAngka + " Tidak ditemukan.");

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}