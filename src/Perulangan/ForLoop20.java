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
public class ForLoop20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan awal bilangan    : "); 
        int awalBilangan = input.nextInt();
        System.out.print("Masukkan akhir bilangan   : "); 
        int akhirBilangan = input.nextInt();
        for(int i = awalBilangan; i <= akhirBilangan; i++) {
            for(int j = akhirBilangan; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for(int l = 1; l <= i-1; l++) {
                System.out.print("*");
            }
            System.out.println();
      }   
    }
}

/* OUTPUT
Masukkan awal bilangan    : 1
Masukkan akhir bilangan   : 5
     *
    ***
   *****
  *******
 *********
*/
