//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch09;

import java.util.Scanner;

public class a_AlgoritmaSieveOfAtkin {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan: ");
        int batas = inputUser.nextInt();
        SieveOfAtkin(batas);
    }

    static void SieveOfAtkin(int batas) {
        if (batas > 2) {
            System.out.print(2 + " ");
        }

        if (batas > 3) {
            System.out.print(3 + " ");
        }


        boolean[] sieve = new boolean[batas];

        for (int i = 0; i < batas; i++) {
            sieve[i] = false;
        }


        for (int x = 1; x * x < batas; x++) {
            for (int y = 1; y * y < batas; y++) {
                int n = (4 * x * x) + (y * y);
                if (n <= batas && (n % 12 == 1 || n % 12 == 5)) {
                    sieve[n] ^= true;
                }

                n = (3 * x * x) + (y * y);
                if (n <= batas && n % 12 == 7) {
                    sieve[n] ^= true;
                }

                n = (3 * x * x) - (y * y);
                if (x > y && n <= batas && n % 12 == 11) {
                    sieve[n] ^= true;
                }
            }
        }


        for (int r = 5; r * r < batas; r++) {
            if (sieve[r]) {
                for (int i = r * r; i < batas; i += r * r) {
                    sieve[i] = false;
                }
            }
        }

        for (int a = 5; a < batas; a++) {
            if (sieve[a]) {
                System.out.print(a + " ");
            }
        }
    }
}