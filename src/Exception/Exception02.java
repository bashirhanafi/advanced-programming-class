/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
class NilaiErrorException extends Exception {
    public String getMessages() {
       return "Nilai harus 0 sampai 100";
    }
}

public class Exception02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int b1, b2, hasil;
        
        try {
            System.out.print("Bilangan 1 : "); b1 = input.nextInt();
            if(b1 < 0 || b1 > 100) {
                throw new NilaiErrorException();
            }
            System.out.print("Bilangan 2 : "); b2 = input.nextInt();
            if(b2 < 0 || b2 > 100) {
                throw new NilaiErrorException();
            }
            hasil = b1/b2;
        }
        catch(NilaiErrorException e) {
            System.out.println(e.getMessages());
        }
        finally {
            System.out.println("Scanner ditutup");
            input.close();
        }
    }
}
