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
public class While07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int jumlahAngka = 0;
        double rataAngka = 0;
        int inputAngka;
        
        while(i <= 4 || rataAngka<=75) {
            System.out.print(i + ". Tulis angka : "); inputAngka = input.nextInt();
            
            jumlahAngka = jumlahAngka + inputAngka;
            if(i > 4) {
                rataAngka = jumlahAngka/i;
                System.out.print("Nilai rata-rata : " + rataAngka);
            }
            i++;
        }
    }
}

/*
1. Tulis angka : 70
2. Tulis angka : 80
3. Tulis angka : 90
4. Tulis angka : 100
5. Tulis angka : 100
Nilai rata-rata : 88
*/
