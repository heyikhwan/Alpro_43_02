//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch09;

import java.util.Scanner;

public class d_AlgoritmaAKSPrimalityTest {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = inputUser.nextInt();

        if (isPrime(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else
            System.out.println(bilangan + " tidak bilangan prima");
    }

    static long[] c = new long[100];


    static void coef(int bilangan) {
        c[0] = 1;
        for (int i = 0; i < bilangan; c[0] = -c[0], i++) {
            c[1 + i] = 1;

            for (int j = i; j > 0; j--) {
                c[j] = c[j - 1] - c[j];
            }
        }
    }

    static boolean isPrime(int bilangan) {
        coef(bilangan);

        c[0]++;
        c[bilangan]--;

        int i = bilangan;
        while ((i--) > 0 && c[i] % bilangan == 0) {
        }

        return i < 0;
    }
}