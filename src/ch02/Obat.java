//Nama	: Ikhwanul Akhmad DLY
//NIM	: 11950110043
//Kelas	: TIF 2-D

package ch02;

import java.util.Date;

public class Obat {
    String barcode;
    String nama;
    Date tanggalKedaluarsa;
    double harga;

    public String getBarcode() {
        return barcode;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalKedaluarsa() {
        return tanggalKedaluarsa;
    }

    public double getHarga() {
        return harga;
    }
}