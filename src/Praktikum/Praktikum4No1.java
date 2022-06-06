package Praktikum;

import java.util.Scanner;

public class Praktikum4No1 {
    public static void main(String[] args) {
        int baris, kolom;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Baris : "); baris = input.nextInt();
        System.out.print("Kolom : "); kolom = input.nextInt();
        int[][] matriks = new int[baris][kolom];
        System.out.println();
        
        for(baris = 0; baris < matriks.length; baris++) {
            for(kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print("Baris " + (baris+1) + " kolom " + (kolom+1) + " : ");
                matriks[baris][kolom] = input.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Bnetuk matriks : ");
        for(baris = 0; baris < matriks.length; baris++) {
            for(kolom = 0; kolom < matriks[baris].length; kolom++) {
              System.out.print(matriks[baris][kolom] + " ");
            } System.out.println(); 
        }
    }
}
