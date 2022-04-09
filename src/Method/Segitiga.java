/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author ACER
 */
public class Segitiga {
    public static void main(String[] args) {
        System.out.println("Luas segitiga : " + hitungLuas(3,7));
    }
    
    public static double hitungLuas(double alas, double tinggi) {
        double hasil = (alas*tinggi)/2;
        return hasil;
    }
}
