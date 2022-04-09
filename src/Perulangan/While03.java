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
public class While03 {
    public static void main(String[] args) {
        int hasil = 0;
        int i = 1;
        while(i <= 10) {
            if(i%2==0) {
                hasil = hasil + i;
            }
            i++;
        }
        System.out.println(hasil);
    }
}

/*
30
*/
