package ch04;

public class g_MenampilkanAngkaKelipatan5YangSebelumnyaJugaKelipatan5 {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka Kelipatan 5 dan Sebelumnya juga Kelipatan 5");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < koleksiAngka.length; i++){
            if (koleksiAngka[i] %5 == 0 && koleksiAngka[i-1] %5 == 0){
                System.out.println(koleksiAngka[i]);
            }
        }

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}