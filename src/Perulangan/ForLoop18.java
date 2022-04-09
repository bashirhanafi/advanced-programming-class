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
public class ForLoop18 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan akhir : "); int bilanganAkhir = input.nextInt();
        for(int i = 1; i <= bilanganAkhir ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            } System.out.println();
          }
        }
    }

/*
output:
Masukkan bilangan akhir : 5
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/
