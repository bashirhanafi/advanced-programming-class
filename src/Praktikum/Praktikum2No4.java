package Praktikum;

import java.util.Scanner;

public class Praktikum2No4 {
    static double a, b, t, r, d1, d2;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Program Perhitungan  Sederhana
        menu();
        
    } 
    
    public static void menu() {
        System.out.println("Program Perhitungan Luas Bangun Datar Sederhana\nMenu : \n1. Trapesium\n2. Lingkaran\n3. Belah Ketupat ");
        System.out.print("Masukkan pilihan : "); int pilihan = input.nextInt();
        if(pilihan == 1) {
            System.out.print("Masukkan sisi sejajar a  : "); a = input.nextDouble();
            System.out.print("Masukkan sisi sejajar b  : "); b = input.nextDouble();
            System.out.print("Masukkan tinggi trapesium: "); t = input.nextDouble();
            System.out.println(hitungTrapesium(a,b,t));
        } else if(pilihan == 2) {
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            System.out.println(hitungLingkaran(r));
        } else if(pilihan == 3) {
            System.out.print("Masukkan diagonal 1 : "); d1 = input.nextDouble();
            System.out.print("Masukkan diagonal 2 : "); d2 = input.nextDouble();
            System.out.println(hitungBelahKetupat(d1,d2));
        } else {
            System.out.println("Menu yang Anda inputkan salah!");
        }
    }
    
    public static String hitungTrapesium(double sisiSejajarA, double sisiSejajarB, double tinggi) {
        return "Luas trapesium adalah " + ((a+b)/2*t);   
    }
    
    public static String hitungLingkaran(double r) {
        return "Luas lingkaran adalah " + 3.14*r*r;
    }
    
    public static String hitungBelahKetupat(double d1, double d2) {
        return "Luas Belah Ketupat adalah " + 0.5*(d1*d2);
    }
}
