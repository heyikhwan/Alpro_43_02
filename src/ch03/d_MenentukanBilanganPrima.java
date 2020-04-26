//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch03;

import java.util.Scanner;

public class a_MenentukanBilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil, jmlPembagi = 0;

        System.out.print("Masukkan bilangan: ");
        bil = input.nextInt();

        for (int i = 1; i <= bil; i++){
            if ( bil %i == 0){
                jmlPembagi++;
            }
        }

        if ( jmlPembagi == 2 ) {
            System.out.println(bil + " adalah bilangan Prima");
        } else {
            System.out.println(bil + " bukan bilangan Prima");
        }

    }
}