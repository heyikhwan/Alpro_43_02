package ch04;

public class k_MenampilkanAngkaYangSetelahnyaLebihBesar {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan Angka-Angka yang setelahnya bernilai lebih besar");
        System.out.println("-------------------------------");
        for (int i = 1; i < koleksiAngka.length; i++){
            if ( koleksiAngka[i] > koleksiAngka[i-1]){
                System.out.println(koleksiAngka[i-1]);
            }
        }

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}