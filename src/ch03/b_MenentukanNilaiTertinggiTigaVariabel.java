//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch03;

import java.util.Scanner;

public class b_MenentukanNilaiTertinggiTigaVariabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        int y = input.nextInt();

        System.out.print("Masukkan nilai z: ");
        int z = input.nextInt();

        if ( x > y && x > z){
            System.out.println(x + " Merupakan nilai tertinggi");
	    System.out.println("Nilai x adalah nilai tertinggi");
        } else if ( y > x && y > z){
            System.out.println(y + " Merupakan nilai tertinggi");
	    System.out.println("Nilai y adalah nilai tertinggi");
        } else {
            System.out.println(z + " Merupakan nilai tertinggi");
	    System.out.println("Nilai z adalah nilai tertinggi");
        }
    }
}
