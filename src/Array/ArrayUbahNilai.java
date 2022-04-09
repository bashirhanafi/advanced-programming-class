/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author ACER
 */
public class ArrayUbahNilai {
    public static void main(String[] args) {
        int[] age = new int[5];
        age[2] = 14;
        age[0] = 34;
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Elemen pada indeks ke-" + i + " adalah " + age[i]);
        }
    }
}
