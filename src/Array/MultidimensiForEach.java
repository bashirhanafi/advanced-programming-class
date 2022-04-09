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
public class MultidimensiForEach {
    public static void main(String[] args) {
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };
        
        for(int[] innerArray : a) {
            for(int data : innerArray) {
                System.out.print(data + "\t");
            }
            System.out.println("");
        }
    }
}
