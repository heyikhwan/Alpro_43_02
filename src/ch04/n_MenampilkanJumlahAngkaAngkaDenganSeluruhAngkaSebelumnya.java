package ch04;

public class n_MenampilkanJumlahAngkaAngkaDenganSeluruhAngkaSebelumnya {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int hasilJumlah = 0;

        for (int i = 0; i < koleksiAngka.length; i++){

            System.out.print("Hasil jumlah " + koleksiAngka[i] + " dengan seluruh angka sebelumny adalah = ");

            System.out.println(koleksiAngka[i] + hasilJumlah);

            hasilJumlah = hasilJumlah + koleksiAngka[i];

        }

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}