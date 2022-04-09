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
public class Kubus {
    public static void main(String[] args) {
        double hitung = hitungVolume(3);
        System.out.println(hitung);
        System.out.println(hitungVolume(5));  
        System.out.println(hitungLuasAlas(10));
    }
    
    // penamaan method sebaiknya menggunakan kata kerja fungsi method tersebut, contoh: hitungVolume(), hitungLuasPersegi()
    public static double hitungVolume(double sisi) {        /* double pada method hitungVolume() menandakan bahwa method ini 
                                                                memiliki nilai parameter/argument, yaitu parameter double sisi */
        double hitung = sisi*sisi*sisi;
        return hitung;                                      // return merupakan cara method mengembalikkan nilai (return value)
    }
    
    public static double hitungLuasAlas(double sisi) {
        double hitung = sisi*sisi;
        return hitung;
    }
    
//    public static void hitungLuasAlasVoid() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan sisi :"); dou
//        double hitung = sisi*sisi;
//        System.out.println(hitung);
//    }
}
