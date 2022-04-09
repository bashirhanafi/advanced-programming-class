/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author ACER
 */
public class Salam {
    public static void main(String[] args) {
        haloULM();
        visiULM();
    }
    
    public static void haloULM() {              // void digunakan untuk method tanpa parameter (argument)
        System.out.println("Halo, ULM");        // haloULM merupakan nama method
                                                // pada method ini, kita hanya memanggil method saja tanpa mengembalikkan parameter dan nilai return
    }
    
    public static void visiULM() {
        System.out.println("ULM terkemuka dan berdaya saing di bidang lingkungan lahan basah");
    }
}
