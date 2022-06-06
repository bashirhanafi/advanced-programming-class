package Praktikum;

import java.util.Scanner;

public class Praktikum2No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda : "); String nama = input.nextLine();
        System.out.print("Masukkan NIM Anda  : "); String nim = input.nextLine();
        System.out.print("Masukkan umur Anda : "); int umur = input.nextInt();
        System.out.println(biodata(nama, nim, umur));
    }
    
    public static String biodata(String nama, String nim, int umur) {
        System.out.println("\nData Anda : ");
        return "Nama : " + nama + "\nNIM : " + nim + "\nUmur : " + umur + "\nTahun Kelahiran : " + (2022-umur);
    }
}
