package Praktikum;

import java.util.Scanner;

public class Praktikum3No4 {
    static int i;
    static int location1, location2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang Array : "); int arrayLength = input.nextInt();
        
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(i = 0; i < array1.length; i++) {
            System.out.print("Array 1 indeks ke-" + i + " : "); array1[i] = input.nextInt();
            
            if(array1[i] > max1) {
                max1 = array1[i];
                location1 = i;
            }
        }
        
        for(i = 0; i < array2.length; i++) {
            System.out.print("Array 2 indeks ke-" + i + " : "); array2[i] = input.nextInt();
            
            if(array2[i] > max2) {
                max2 = array2[i];
                location2 = i;
            }
        }
        
        
        if(max1 > max2) {
            System.out.println("Nilai maks : " + max1 + " terletak pada Array 1 indeks ke- " + location1);
        } else if(max1 < max2) {
            System.out.println("Nilai maks : " + max2 + " terletak pada Array 2 indeks ke- " + location2);
        } else if(max1 == max2) {
            System.out.println("Nilai maks : " + max1 + " terletak pada Array 1 indeks ke- " + location1 + " dan Array 2 indeks ke- " + location2);
        }
    }
}
