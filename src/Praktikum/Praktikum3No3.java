package Praktikum;

import java.util.Scanner;

public class Praktikum3No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array : "); int arrayLength = input.nextInt();
        
        int max = Integer.MIN_VALUE;
        int[] array = new int[arrayLength];
        
        for(int i = 0; i < array.length; i++) {
            System.out.print("Array indeks ke-" + i + " : "); array[i] = input.nextInt();
            
            if(array[i] > max) {
                max = array[i];
            }
        }  
        
        System.out.println("Nilai maksimum dari Array : " + max);
    }
}
