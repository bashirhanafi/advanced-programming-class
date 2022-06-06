package UAS.OOP;

import java.util.Scanner;

class Mahasiswa {
    static String kodeMataKuliah, jawaban, nama, nim, namaMataKuliah;
    static double SKS, poinSKS, bobotSKS, jumlahPoinSKS, jumlahSKS, rataRataIPK;
    static Scanner input = new Scanner(System.in);

    // Constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.nim = nim;
    }

    // menggunakan polymorphism maka method ini (super class) tidak akan dieksekusi
    // method di subclass yang akan dieksekusi karena overriding

    void masukkanNilai() {}                 // ini hanya dummy method
    void masukkanJumlahTotalSKS() {}        // untuk percobaan mengaplikasikan overriding
    void menghitungRataRataIPK() {}
}
