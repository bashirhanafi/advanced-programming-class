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

public class Bank {
    static Scanner input = new Scanner(System.in);
    static int saldo = 10000;
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ULM");
        System.out.println("==========================");
        simpanUang(3000);
        cekUang();
        ambilUang(7000);
        cekUang();
    }
    
    public static int simpanUang(int uang) {                                    // 1 method 1 pekerjaan
        System.out.print("Masukkan uang yang akan disimpan : Rp.\t"); uang = input.nextInt();
        saldo += uang;
        return saldo;
    }
    
    public static int ambilUang(int uang) {
        System.out.print("Masukkan uang yang akan diambil : Rp.\t"); uang = input.nextInt();
        saldo -= uang;
        return saldo;
    }
    
    public static void cekUang() {
        System.out.println("Saldo saat ini : Rp.\t" + saldo);
    }
}
