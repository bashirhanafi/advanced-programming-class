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
public class While06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tulis nama : "); String nama = input.nextLine();
        System.out.println("Halo " + nama);
        System.out.print("Apakah ingin menginput lagi? (Y/N) "); String answer = input.nextLine();
        
        while(answer.equals("Y")) {
            System.out.print("Tulis nama : "); nama = input.nextLine();
            System.out.println("Halo " + nama);
            System.out.print("Apakah ingin menginput lagi? (Y/N) "); answer = input.nextLine();
        }
        
        
    }
}
