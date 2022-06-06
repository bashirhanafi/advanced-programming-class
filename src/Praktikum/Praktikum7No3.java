package Praktikum;

import java.util.Scanner;

public class Praktikum7No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a : "); int a = input.nextInt();
        System.out.print("Masukkan b : "); int b = input.nextInt();
        
        int hasil = setFPB(a, b);
        System.out.println(hasil);
    }
    
    static int setFPB(int a, int b) {
        if(a == 0) {
            return b;
        } else if(b == 0) {
            return a;
        } else {
            return setFPB(b%a, a);
        }
    }
}
