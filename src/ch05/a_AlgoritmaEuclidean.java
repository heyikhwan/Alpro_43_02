//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch05;

import  java.util.Scanner;

public class a_AlgoritmaEuclidean {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai 1 : ");
        int n1 = inputUser.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int n2 = inputUser.nextInt();

        int r = n1 % n2;

        while ( r != 0 ){
            n1 = n2;
            n2 = r;
            r = n1 % n2;
        }

        System.out.println("FPB = " + n2);
    }
}