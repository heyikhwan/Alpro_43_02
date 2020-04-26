//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch03;

import java.util.Scanner;

public class d_MenentukanNilaiTertinggiDuaVariabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();

        if ( x > y ) {
            System.out.println(x + " Lebih besar dari " + y);
	    System.out.println("Nilai x Lebih besar dari nilai y");
        } else {
            System.out.println(y + " Lebih besar dari " + x);
	    System.out.println("Nilai y Lebih besar dari nilai x");
        }
    }
}