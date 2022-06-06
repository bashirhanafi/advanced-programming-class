package Praktikum;

import java.util.Scanner;

public class Praktikum7No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan digit : "); int abcde = input.nextInt();
        
        int hasil = jumlahDigit(abcde);
        System.out.printf("Jumlah digit dari %d adalah %d", abcde, hasil);
    }
    
    static int jumlahDigit(int abcde) {
        if(abcde==0)
            return 0;
        return (abcde%10 + jumlahDigit(abcde/10));
    }
}
