package Praktikum;

import java.util.Scanner;

public class Praktikum2No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input : "); int x = input.nextInt();
        System.out.println("Nilai faktorial dari " + x + " adalah " + hitungFaktorial(x));
    }
    
    public static int hitungFaktorial(int x) {
        if(x == 1 || x == 0) {
            return 1;
        } else {
            return x*hitungFaktorial(x - 1);
        }
    }
}
