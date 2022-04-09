/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsi;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MethodFunction {
    static int luas;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = input.nextInt();
        luas = luasPersegi(sisi);
        System.out.println("Luas persegi adalah " + luas + " cm^2");
        luasPermukaanKubus(luas);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaanKubus(luas) + " cm^2");
    }
    
    public static int luasPersegi(int sisi) {
        int luas = sisi*sisi;
        return luas;
    }
    
    public static int luasPermukaanKubus(int l) {
        return 6 * luas;
    }
}
