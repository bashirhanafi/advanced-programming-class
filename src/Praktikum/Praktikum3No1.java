package Praktikum;

import java.util.Scanner;

public class Praktikum3No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array : "); int arrayLength = input.nextInt(); int[] array = new int[arrayLength];
        
        int totalArray = 0;
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("Bilangan genap ke- " + (i+1) + " : " + (i*2));
            totalArray = totalArray + (i*2);
        }
        System.out.println("Total isi Array : " + totalArray);
    }
}
