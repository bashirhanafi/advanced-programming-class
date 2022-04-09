/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author ACER
 */
public class ForLoop15 {
    public static void main(String[] args) {
        int jumlahGanjilDanKelipatan5 = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0 && i%5==0) {
                System.out.println(i);
                jumlahGanjilDanKelipatan5++;
            }
        } System.out.println("Jumlah bilangan Ganjil dan Kelipatan 5 adalah " + jumlahGanjilDanKelipatan5);
    }
}
