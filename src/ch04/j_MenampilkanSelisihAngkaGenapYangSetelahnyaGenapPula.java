package ch04;

public class j_MenampilkanSelisihAngkaGenapYangSetelahnyaGenapPula {
    public static void main(String[] args) {
        int[] koleksiAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int i = 1;

        do{
            if (koleksiAngka[i] %2 == 0 && koleksiAngka[i-1] %2 == 0){
                System.out.print("Selisih dari " + koleksiAngka[i-1] + " dan " + koleksiAngka[i] + " adalah = ");
                System.out.println(koleksiAngka[i-1] - koleksiAngka[i] + " ");
            }
            i++;
        } while(i < koleksiAngka.length);

	//Nama	: Ikhwanul Akhmad DLY
	//NIM	: 11950110043
	//Kelas	: TIF 2-D

    }
}