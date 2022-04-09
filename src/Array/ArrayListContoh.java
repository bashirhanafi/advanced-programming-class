/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ArrayListContoh {
    public static void main(String[] args) {
        ArrayList dompet = new ArrayList();
        
        dompet.add(10000);
        dompet.add(5000);
        dompet.add("peniti");
        dompet.add("2000");
        System.out.println(dompet);
        
        dompet.add("pulpen");
        System.out.println(dompet);
        
        dompet.remove("peniti");
        System.out.println(dompet);
        
        dompet.remove(0);
        System.out.println(dompet);
        System.out.println("Isi dompet saat ini " + dompet);
        
    }
}

/*
[10000, 5000, peniti, 2000]
[10000, 5000, peniti, 2000, pulpen]
[10000, 5000, 2000, pulpen]
[5000, 2000, pulpen]
Isi dompet saat ini [5000, 2000, pulpen]
*/
