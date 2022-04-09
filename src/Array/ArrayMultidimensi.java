/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author ACER
 */
public class ArrayMultidimensi {
    public static void main(String[] args) {
        int[][] a = {
            {1,-2,3},
            {-4,-5,6,9},
            {7}
        };
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

/*
1	-2	3	
-4	-5	6	9	
7	
*/
