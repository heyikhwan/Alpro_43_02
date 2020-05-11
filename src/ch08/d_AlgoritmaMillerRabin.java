//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch08;

import java.util.Scanner;

public class d_AlgoritmaMillerRabin {
    public static void main(String args[]) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = inputUser.nextInt();

        int k = 4;

        if (isPrime(bilangan, k)){
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }

    static int power(int x, int y, int p) {

        int hasil = 1;

        x = x % p;

        while (y > 0) {
            if ((y & 1) == 1) {
                hasil = (hasil * x) % p;
            }

            y = y >> 1;
            x = (x * x) % p;
        }
        return hasil;
    }

    static boolean miillerTest(int d, int n) {
        int a = 2 + (int)(Math.random() % (n - 4));

        int x = power(a, d, n);

        if (x == 1 || x == n - 1) {
            return true;
        }

        while (d != n - 1) {
            x = (x * x) % n;
            d *= 2;

            if (x == 1) {
                return false;
            }
            if (x == n - 1) {
                return true;
            }
        }

        return false;
    }

    static boolean isPrime(int n, int k) {

        if (n <= 1 || n == 4) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        int d = n - 1;

        while (d % 2 == 0) {
            d /= 2;
        }

        for (int i = 0; i < k; i++) {
            if (!miillerTest(d, n)) {
                return false;
            }
        }

        return true;
    }
}