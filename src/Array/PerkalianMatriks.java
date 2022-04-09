/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PerkalianMatriks {
    static int skalar, baris, kolom;
    static int[][] matriks = new int[baris][kolom];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Perkalian Matriks dengan Array");
        System.out.print("Masukkan nilai skalar : "); skalar = input.nextInt();
        System.out.print("Masukkan nilai baris  : "); baris = input.nextInt();
        System.out.print("Masukkan nilai kolom  : "); kolom = input.nextInt(); 
        
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.println("Masukkan nilai matriks pada baris " + i + " kolom ke " + j); 
                matriks[i][j] = input.nextInt();
//                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("Matriks yang terbentuk");
            print();
            System.out.println("Hasil perkaliam matriks dengan skalar " + skalar + " adalah ");
            printSkalar();
        }         
    }
    
    public static void print() {
        for(int i = 0; i < matriks.length; i++) {
            for(int j = 0; j < matriks[i].length; j++) {
                    System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void printSkalar() {
        for(int i = 0; i < matriks.length; i++) {
            for(int j = 0; j < matriks[i].length; j++) {
                System.out.println(matriks[i][j]*skalar + "\t");
            }
        }
    }
}
