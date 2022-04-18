/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.*;

/**
 *
 * @author ACER
 */

public class SubmissionException {
    static int n = 9999999;
    static String kodeMataKuliah, jawaban;
    static double[] nilai = new double[n];
    static double SKS, poinSKS, bobotSKS, jumlahPoinSKS, jumlahSKS;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    } 
    
    public static void masukkanJumlahTotalSKS() {
        try {
            System.out.print("Masukkan Jumlah Total SKS Keseluruhan : "); jumlahSKS = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Input harus menggunakan angka!");
            System.out.println("Unfortunately, application has stopped.");
            System.exit(0);
        } 
    }
    
    public static void masukkanNilai() {
        try {
            for(int i = 1; i < n; i++) {
                System.out.println("\nNilai ke-" + i);
                System.out.print("Kode MK : "); kodeMataKuliah = input.next();
                System.out.print("Nama MK : "); String namaMataKuliah = input.nextLine();
                input.nextLine();
                System.out.print("SKS     : "); SKS = input.nextDouble();
                System.out.print("Nilai   : "); nilai[i] = input.nextDouble();
                    if(nilai[i] >= 0 && nilai[i] < 40) {
                        bobotSKS = 0.00;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 40 && nilai[i] < 50) {
                        bobotSKS = 1.00;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 50 && nilai[i] < 60) {
                        bobotSKS = 1.50;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 60 && nilai[i] < 64) {
                        bobotSKS = 2.00;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 64 && nilai[i] < 67) {
                        bobotSKS = 2.50;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 67 && nilai[i] < 70) {
                        bobotSKS = 2.75;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 70 && nilai[i] < 75) {
                        bobotSKS = 3.00;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 75 && nilai[i] < 77) {
                        bobotSKS = 3.50;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 77 && nilai[i] < 80) {
                        bobotSKS = 3.75;
                        poinSKS = SKS*bobotSKS;
                    } else if(nilai[i] >= 80 && nilai[i] <=100) {
                        bobotSKS = 4.00;
                        poinSKS = SKS*bobotSKS;
                    } else {
                        System.out.println("Nilai yang Anda input salah!");
                    }
                    
                    jumlahPoinSKS += poinSKS;
                    
                    System.out.print("Tambah data ? (y/n) : "); jawaban = input.next();
                    if(jawaban.equalsIgnoreCase("n")) {
                        menghitungRataRataIPK();
                        delayedText();
                        System.exit(0);
                    }
                }
            }
        catch(InputMismatchException e) {
            System.out.println("Input harus menggunakan angka!");
            System.out.println("Unfortunately, application has stopped.");
            System.exit(0);
        }
    }
    
    public static void menghitungRataRataIPK(){
        double rataRataIPK = jumlahPoinSKS/jumlahSKS;
        System.out.format("\nRata-rata IPK : %.3f ", rataRataIPK);
    }
    
    public static void menu() {
        System.out.println("Aplikasi Penghitung Nilai IPK Mahasiswa\n");
        masukkanJumlahTotalSKS();
        masukkanNilai();
    }

    public static void delayedText() {
        try {
		    Thread.sleep(10000);
	}
        catch (InterruptedException e) { 
			// do nothing 
	}
    }
}
