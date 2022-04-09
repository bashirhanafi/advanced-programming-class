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
public class ForLoop19 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan awal : "); int bilanganAwal = input.nextInt();
    System.out.print("Masukkan bilangan akhir : "); int bilanganAkhir = input.nextInt();
        for(int i = bilanganAwal; i <= bilanganAkhir ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            } System.out.println();
          }
    }
}
