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
public class ArrayStatistikAngka {
    public static void main(String[] args) {
        double total = 0;
        double rerata = 0;
        int min = 999;
        int max = -999;
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah angka yang ingin diinput: ");
        int jml = input.nextInt();

        int[] angka = new int[jml];
        for (int i = 0; i < jml; i++) {
            System.out.print("Angka ke- " + (i + 1) + ": ");
            angka[i] = input.nextInt();
            total = total + angka[i];

            if (angka[i] < min) {
                min = angka[i];
            } else if (angka[i] > max) {
                max = angka[i];
            }

        }

        rerata = total / jml;
        System.out.println("\nRerata adalah = " + rerata);
        System.out.println("Nilai terkecil = " + min);
        System.out.println("Nilai terbesar = " + max);

    }
}
