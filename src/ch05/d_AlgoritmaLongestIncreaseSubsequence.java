//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch05;

import  java.util.Scanner;

public class d_AlgoritmaLongestIncreaseSubsequence {
        static int lis(int arr[],int n)
        {
            int lis[] = new int[n];
            int i,j,max = 0;

            for ( i = 0; i < n; i++ ) {
                lis[i] = 1;
            }

            for ( i = 1; i < n; i++ ) {
                for (j = 0; j < i; j++) {
                    if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                        lis[i] = lis[j] + 1;
                    }
                }
            }

            for ( i = 0; i < n; i++ ) {
                if (max < lis[i]) {
                    max = lis[i];
                }
            }

            return max;
        }

        public static void main(String args[])
        {
            int arr[] = { 101, 18, 7, 2, 3, 5, 10, 9 };
            int n = arr.length;
            System.out.println("Panjang LIS adalah " + lis( arr, n ) + "\n" );
        }
    }