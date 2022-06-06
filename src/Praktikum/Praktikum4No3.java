package Praktikum;

import java.util.Scanner;

public class Praktikum4No3 {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Input n : "); n = input.nextInt();
        System.out.print("Input K : "); k = input.nextInt();
        int[][] matriks = new int[n][n];
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Baris " + (i+1) + " kolom " + (j+1) + " : ");
                matriks[i][j] = input.nextInt();
            }  
        }
        
        System.out.println();
        System.out.println("Matriks : ");
        for(int i = 0; i < matriks.length; i++) {
            System.out.print("| "); 
            for(int j = 0; j < matriks.length; j++) {
              System.out.print(matriks[i][j] + " ");
            } System.out.println(" |"); 
        }
        
        System.out.println();
        System.out.println("Matriks skalar : ");
        for(int i = 0; i < matriks.length; i++) {
            System.out.print("| "); 
            for(int j = 0; j < matriks[0].length; j++) {
                System.out.print(k*matriks[i][j] + " ");
            } System.out.println(" |"); 
        }
    }
}
