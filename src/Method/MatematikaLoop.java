/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MatematikaLoop {
    static double hasil;
    static String operasi = null;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        System.out.println("");
        
        
//        System.out.println("Menu Aplikasi Matematika :");
//        System.out.println("1. Penambahan");
//        System.out.println("2. Pengurangan");
//        System.out.println("3. Perkalian");
//        System.out.println("4. Pembagian");
//
//        System.out.println("Pilih Menu : ");
//        int menu = input.nextInt();
//        int angkaPertama, angkaKedua;
//
//        String operasi = null;
//        if (menu >= 1 & menu <= 4) {
//            System.out.print("Masukkan angka pertama : ");
//            angkaPertama = input.nextInt();
//            System.out.print("Masukkan angka kedua : ");
//            angkaKedua = input.nextInt();
//            double hasil = 0;
//            if (menu == 1) {
//                hasil = angkaPertama + angkaKedua;
//                operasi = "Penambahan";
//            } else if (menu == 2) {
//                hasil = angkaPertama - angkaKedua;
//                operasi = "Pengurangan";
//            } else if (menu == 3) {
//                hasil = angkaPertama * angkaKedua;
//                operasi = "Perkalian";
//            } else if (menu == 4) {
//                hasil = (double) angkaPertama / angkaKedua;
//                operasi = "Pembagian";
//            }
//
//            System.out.println("Hasil " + operasi + " antara " + angkaPertama + " dan " + angkaKedua + " adalah " + hasil);
//        } else {
//            System.out.println("System eror");
//        }
//    }
    }
    
    public static void menu() {
        System.out.print("Menu Aplikasi Matematika :\n1. Penambahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\nPilih menu : "); int menu = input.nextInt();
        System.out.print("Masukkan angka pertama : "); int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua : "); int angka2 = input.nextInt();
        if(menu==1) {
            penambahan(angka1, angka2);
            menu();
        } else if(menu==2) {
            pengurangan(angka1, angka2);
            menu();
        } else if(menu==3) {
            perkalian(angka1, angka2);
            menu();
        } else if(menu==4) {
            pembagian(angka1, angka2);
            menu();
        }

    }
    
    public static double penambahan(double angka1, double angka2) {
        double hasil = angka1 + angka2;
        operasi = "Penambahan";
        System.out.println("Hasil " + operasi + " antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        return hasil;
    }
    
    public static double pengurangan(double angka1, double angka2) {
        double hasil = angka1 + angka2;
        operasi = "Pengurangan";
        System.out.println("Hasil " + operasi + " antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        return hasil;
    }
    public static double perkalian(double angka1, double angka2) {
        double hasil = angka1 * angka2;
        operasi = "Perkalian";
        System.out.println("Hasil " + operasi + " antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        return hasil;
    }
    
    public static double pembagian(double angka1, double angka2) {
        double hasil = angka1 / angka2;
        operasi = "Pembagian";
        System.out.println("Hasil " + operasi + " antara " + angka1 + " dan " + angka2 + " adalah " + hasil);
        return hasil;
    }
}
