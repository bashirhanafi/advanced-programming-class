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
public class While05 {
    public static void main(String[] args) {
    System.out.print("x  |");
    
    int i = 0;
    while(i <= 3) {
        System.out.print("   " + i);
        i++;
    } 
    
    System.out.println();
    System.out.println("--------------------");
    
    for(i = 0; i <= 3; i++) {
        System.out.print(i + "  |");
            for(int j = 0; j <= 3; j++) {
                System.out.print("   " + i*j);
            }
        System.out.println();
        }
    }
}
