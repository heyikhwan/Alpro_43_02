//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch09;

import java.util.*;

public class c_AlgoritmaSieveOfSundaram {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan: ");
        int batas = inputUser.nextInt();

        SieveOfSundaram(batas);
    }

    static void SieveOfSundaram(int batas) {

        int batasNew = (batas - 2) / 2;

        boolean[] prima = new boolean[batasNew + 1];

        Arrays.fill(prima, false);


        for (int i = 1; i <= batasNew; i++) {
            for (int j = i; (i + j + 2 * i * j) <= batasNew; j++) {
                prima[i + j + 2 * i * j] = true;
            }
        }

        if (batas > 2) {
            System.out.print(2 + " ");
        }

        for (int i = 1; i <= batasNew; i++) {
            if (!prima[i]) {
                System.out.print(2 * i + 1 + " ");
            }
        }
    }

}
