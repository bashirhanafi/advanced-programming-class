package Praktikum;

import java.util.Scanner;

public class Praktikum1No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah nilai : "); int n = input.nextInt();
        int terkecil = Integer.MAX_VALUE;
        
        System.out.print("Masukkan angka : ");
        for(int i = 0; i < n; i++) {
            int angka = input.nextInt();
            if(angka < terkecil) {
                terkecil = angka;
            }
        }
        
        System.out.println("Nilai terkecilnya adalah " + terkecil);
        }
}
