package ch04;

public class f_MenampilkanAngkaYangGanjilDiApitAngkaGenap {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka Ganjil di apit Angka Genap");
        System.out.println("--------------------------------");

        for (int i = 0; i < koleksiAngka.length-1; i++){
            if (koleksiAngka[i] %2 != 0){
                System.out.println(koleksiAngka[i]);
            }
        }

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}