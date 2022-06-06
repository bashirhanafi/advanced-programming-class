package Praktikum;

import java.util.Scanner; 

public class Praktikum1No1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka pertama : "); int angkaPertama = input.nextInt();
    System.out.print("Masukkan angka kedua : "); int angkaKedua = input.nextInt();
    
    for(int i = angkaPertama; i <= angkaKedua; i++) {
        if(i % 2 != 0) {
            System.out.println(i + " Ganjil");
        } else {
            System.out.println(i);
        }
    }
  }
}
