/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Exception01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int b1, b2, hasil;
        
        try {
            System.out.print("Bilangan1 : "); b1 = input.nextInt();
            System.out.print("Bilangan2 : "); b2 = input.nextInt();
            hasil = b1/b2;
            System.out.println("Hasil: " + hasil);
        }
        catch(ArithmeticException e) {
            System.out.println("Terjadi error saat membagi");
        }
        catch(InputMismatchException e) {
            System.out.println("Inputan harus Integer");
        }
        finally {
            System.out.println("Program ditutup");
            input.close();
        }
            System.out.println("Program ditutup normal");
    }
}
