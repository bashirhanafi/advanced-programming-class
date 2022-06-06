package Praktikum;

import java.util.Scanner;

public class Praktikum4No4 {
    public static void main(String[] args) {
        String[] nama;
        int baris;
        Scanner input = new Scanner(System.in);
        System.out.print("Baris : "); baris = input.nextInt(); 
        input.nextLine();
        nama = new String[baris];
        int[][] nil = new int[baris][3];
        
        System.out.println();
        for(int i = 0; i < baris; i++) {
            System.out.print("Nama : "); nama[i] = input.next();
            System.out.print("MP1  : "); nil[i][0] = input.nextInt();
            System.out.print("MP2  : "); nil[i][1] = input.nextInt();
            System.out.print("MP3  : "); nil[i][2] = input.nextInt();
            System.out.println();
        }
        
        System.out.println("| Nama\t\t| MP1\t\t| MP2\t\t| MP3\t\t|");
        for(int i = 0; i < nama.length; i++) {
            System.out.print("| " + nama[i]+"\t\t");  
            for(int j = 0; j < 3; j++) {
                System.out.print("| " + nil[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
