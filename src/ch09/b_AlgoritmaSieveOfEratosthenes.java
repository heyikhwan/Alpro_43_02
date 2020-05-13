//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch09;

import java.util.Scanner;

public class b_AlgoritmaSieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan: ");
        int batas = inputUser.nextInt();

        b_AlgoritmaSieveOfEratosthenes cariPrima = new b_AlgoritmaSieveOfEratosthenes();
        cariPrima.sieveOfEratosthenes(batas);
    }

    void sieveOfEratosthenes(int batas) {
        boolean[] prima = new boolean[batas+1];
        for(int i = 0; i < batas; i++) {
            prima[i] = true;
        }

        for(int p = 2; p*p <= batas; p++) {
            if(prima[p]) {
                for(int i = p*2; i <= batas; i += p) {
                    prima[i] = false;
                }
            }
        }

        for(int i = 2; i <= batas; i++) {
            if(prima[i]) {
                System.out.print(i + " ");
            }
        }
    }
}