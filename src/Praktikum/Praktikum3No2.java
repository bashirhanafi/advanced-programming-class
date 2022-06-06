package Praktikum;

import java.util.Scanner;

public class Praktikum3No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang Array : "); int arrayLength = input.nextInt(); int[] array = new int[arrayLength];
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(i*3 + " ");
        }
    }
}
