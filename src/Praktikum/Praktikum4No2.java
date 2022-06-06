package Praktikum;

import java.util.Scanner;

public class Praktikum4No2 {
    public static void main(String[] args) {
        int baris, kolom;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Baris : "); baris = input.nextInt();
        System.out.print("Kolom : "); kolom = input.nextInt();
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        
        System.out.println();
        
        for(baris = 0; baris < matriksA.length; baris++) {
            for(kolom = 0; kolom < matriksA[baris].length; kolom++) {
                System.out.print("Matriks A baris " + (baris+1) + " kolom " + (kolom+1) + " : ");
                matriksA[baris][kolom] = input.nextInt();
            }
        }
        
        for(baris = 0; baris < matriksB.length; baris++) {
            for(kolom = 0; kolom < matriksB[baris].length; kolom++) {
                System.out.print("Matriks B baris " + (baris+1) + " kolom " + (kolom+1) + " : ");
                matriksB[baris][kolom] = input.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Matriks A = ");
        for(baris = 0; baris < matriksA.length; baris++) {
            System.out.print("| ");
            for(kolom = 0; kolom < matriksA[baris].length; kolom++) {
              System.out.print(matriksA[baris][kolom] + " ");
            } System.out.println(" |"); 
        }
        
        System.out.println("Matriks B = ");
        for(baris = 0; baris < matriksB.length; baris++) {
            System.out.print("| ");
            for(kolom = 0; kolom < matriksB[baris].length; kolom++) {
              System.out.print(matriksB[baris][kolom] + " ");
            } System.out.println(" |"); 
        }
        
        System.out.println("Matriks A - B = ");
        for(baris = 0; baris < matriksB.length; baris++) {
            System.out.print("| ");
            for(kolom = 0; kolom < matriksB[baris].length; kolom++) {
              System.out.print(matriksA[baris][kolom] - matriksB[baris][kolom] + " ");
            } System.out.println(" |"); 
        }
    }
}
