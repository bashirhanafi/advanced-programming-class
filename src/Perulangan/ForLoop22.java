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
public class ForLoop22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan awal bilangan  : "); int awalBilangan = input.nextInt();
        System.out.print("Masukkan akhir bilangan : "); int akhirBilangan = input.nextInt();
        for(int i = awalBilangan; i <= akhirBilangan; i++) {
            int bilangan = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j==0) {
                    bilangan = bilangan + 1;
                }
            } 
        if(bilangan==2) {
            System.out.print(i + " ");
        }
      }
    }
}

/*
Masukkan awal bilangan  : 1
Masukkan akhir bilangan : 50
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/
