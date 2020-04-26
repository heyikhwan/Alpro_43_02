//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch03;

import java.util.Scanner;

class c_MenentukanPembagiTerkecil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if ( bil > 0 && bil <= 4 ){
            System.out.println("Pembagi terkecil dari " + bil + " adalah " + bil);
        } else {
            for (int i = 3; i <= bil; i ++){
                if ( bil %i == 0){
                    System.out.println("Pembagi terkecil dari " + bil + " adalah " + i);
                    break;
                }
            }
        }
    }
}