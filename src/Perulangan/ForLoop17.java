/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

public class ForLoop17 {
    public static void main(String[] args) {
        int jumlahGanjilDanKelipatan5 = 0;
        int hasilPenjumlahan = 0;
        double hasilPerkalian = 1;
        double hasilAkhir = 0;
        int hasilRataRata = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0 && i%5==0) {
                jumlahGanjilDanKelipatan5++;
                hasilPenjumlahan = hasilPenjumlahan + i;
                hasilPerkalian = hasilPerkalian * i;
                hasilAkhir = (hasilPerkalian/hasilPenjumlahan);
                hasilRataRata = (hasilPenjumlahan/jumlahGanjilDanKelipatan5);
            }
        } 
        System.out.println("Jumlah bilangan Ganjil dan Kelipatan 5 adalah " + jumlahGanjilDanKelipatan5);
        System.out.println("Hasil penjumlahan bilangan tersebut adalah " + hasilPenjumlahan + "\nHasil perkalian bilangan tersebut adalah " + hasilPerkalian);
        System.out.println("Hasil akhir adalah " + hasilAkhir);
        System.out.println("Hasil rata-rata adalah " + hasilRataRata);
    }
}
