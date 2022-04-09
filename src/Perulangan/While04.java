/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author ACER
 */
public class While04 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            int j = 1;
            while(j <= i) {
                System.out.print(i + "\t");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}

/*
run:
1	
2	2	
3	3	3	
4	4	4	4	
5	5	5	5	5	
*/
