package Praktikum;

import java.util.Scanner;

public class Praktikum2No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kelipatan angka : "); int kelipatan = input.nextInt();
        System.out.println("Masukkan rentang angka   : "); 
        System.out.print("dari    : "); int rentang1 = input.nextInt();
        System.out.print("hingga  : "); int rentang2 = input.nextInt();
        hitung(kelipatan, rentang1, rentang2);
        
    }
    
    public static String hitung(int kelipatan, int rentang1, int rentang2) {
        for(int i = rentang1; i < rentang2; i++) {
            if(i % kelipatan == 0 && i %2 != 0) {
                System.out.print(i + ",");
            }
        } 
        return null;
    }
}
