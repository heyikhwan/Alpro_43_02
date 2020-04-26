package ch04;

public class e_MenampilkanAngkaYangMemilikiAngkaDua {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Yang memiliki angka 2  = [ ");
        for (int i  = 0; i < koleksiAngka.length; i++){
            if (koleksiAngka[i] % 10 == 2 || koleksiAngka[i] / 10 == 2) {
                System.out.print(koleksiAngka[i] + " ");
            }
        }
        System.out.print("]");

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}