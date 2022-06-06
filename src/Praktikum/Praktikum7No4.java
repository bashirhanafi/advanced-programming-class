package Praktikum;

import java.util.Scanner;

public class Praktikum7No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array : "); int length = input.nextInt();
        
        int elements[] = new int[length];
        for(int i = 0; i < length; i++) {
            elements[i] = input.nextInt();
        }
        
        System.out.println("Min : " + rekursifMin(elements, length));
        System.out.println("Max : " + rekursifMax(elements, length));
        
    }
    
    static int rekursifMin(int elements[], int length) {
        int minimum;
        
        if(length==1) {
            minimum = elements[0];
            return minimum;
        }
        
        return Math.min(elements[length-1], rekursifMin(elements, length-1));
    }
    
    static int rekursifMax(int elements[], int length) {
        int maximum;
        
        if(length==0) {
            maximum = elements[0];
            return maximum;
        }
        
        return Math.max(elements[length-1], rekursifMax(elements, length-1));
    }
}
