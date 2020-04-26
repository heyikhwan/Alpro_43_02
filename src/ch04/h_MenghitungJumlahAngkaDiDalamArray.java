package ch04;

public class h_MenghitungJumlahAngkaDiDalamArray {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;

        for (int i = 0; i < koleksiAngka.length; i++){
            jumlah = jumlah + koleksiAngka[i];
        }

        System.out.println("Hasil Jumlah Angka = " + jumlah);

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}