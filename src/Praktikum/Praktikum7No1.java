package Praktikum;

import java.util.Scanner;

public class Praktikum7No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan input : "); int n = input.nextInt();
        bintang(n);
    }
        
    
    static void cetakBintang(int n) {
        if(n<1) {
            return;
        }
            
        System.out.print("*");
        cetakBintang(n-1);
    }
        
    static void bintang(int n) {
        if(n<1) {
            return;
        }
            
        cetakBintang(n);
        System.out.println("");
        bintang(n-1);
        }
}
