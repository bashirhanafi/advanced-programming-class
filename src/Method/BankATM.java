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
public class BankATM {
    static Scanner input = new Scanner(System.in);
    static int saldo = 10000;
    static String kondisi;
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ULM");
        System.out.println("==========================");
        menu();
       
    }
    
    public static void menu() {
        System.out.print("Menu : \n1. Cek Saldo\n2. Ambil Uang\n3. Simpan Uang\nPilih menu :"); int fitur = input.nextInt();
        if(fitur == 1) {
            cekUang();
            System.out.println("");
            menu();
        } else if(fitur == 2) {
            ambilUang(7000);
            System.out.println("");
            menu();
        } else if(fitur == 3) {
            simpanUang(3000);
            System.out.println("");
            menu();
        } 
    }
    
    public static int simpanUang(int uang) {                                    // 1 method 1 pekerjaan
        
        System.out.print("Masukkan uang yang akan disimpan : Rp.\t"); uang = input.nextInt();
        saldo += uang;
        return saldo;
    }
    
    public static int ambilUang(int uang) {
        System.out.print("Masukkan uang yang akan diambil : Rp.\t"); uang = input.nextInt();
        if(uang > saldo) {
            System.out.println("Saldo Anda tidak mencukupi!");
        } else if(uang < saldo) {
            saldo -= uang;
        } return saldo;
    }
    
    public static void cekUang() {
        System.out.println("Saldo saat ini : Rp.\t" + saldo);
    }
}
