/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.util.Scanner;

public class ForLoop16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan awal bilangan  : "); int awalBilangan = input.nextInt();
        System.out.print("Masukkan akhir bilangan : "); int akhirBilangan = input.nextInt();
        if(awalBilangan < akhirBilangan) {
            for(int i = awalBilangan; i <= akhirBilangan; i++) {
                System.out.print(i + ",");
            }
        } else if(awalBilangan > akhirBilangan) {
            for(int i = awalBilangan; i >= akhirBilangan; i--) {
                System.out.print(i + ",");
            }
        }
    }
}

/* OUTPUT
Masukkan awal bilangan  : 20
Masukkan akhir bilangan : 40
20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
*/
