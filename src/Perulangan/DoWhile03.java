/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class DoWhile03 {
    static String cond;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Tulis nama : "); String nama = input.nextLine();
            System.out.println("Hello " + nama);
            System.out.print("Apakah ingin menginput lagi? (Y/N) "); cond = input.nextLine();
        } while(cond.equals("Y"));
    }
}
