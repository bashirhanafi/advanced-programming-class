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
public class ForLoop21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan awal bilangan : "); int awalBilangan = input.nextInt();
        System.out.print("Masukkan akhir bilangan : "); int akhirBilangan = input.nextInt();
        
        for(int i = akhirBilangan; i >= awalBilangan; i--) {
            for(int j = akhirBilangan; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k < (i*2); k++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}

/*
Masukkan awal bilangan : 1
Masukkan akhir bilangan : 3
*****
 ***
  *
*/
