package ch04;

public class m_MenghitungAngkaSelisihPadaPoinI {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int angkaSelisih, hasilJumlah = 0;

        System.out.print("Hasil penjumlahan angka selisih pada poin I adalah = ");
        for (int i = 1; i < koleksiAngka.length; i++){
            angkaSelisih = koleksiAngka[i-1] - koleksiAngka[i];

            hasilJumlah += angkaSelisih;
        }
        System.out.println(hasilJumlah);

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}