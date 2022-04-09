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
public class ForLoop14 {
    public static void main(String[] args) {
        int jumlahGanjil = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
                jumlahGanjil++;
            }
        } System.out.println("Jumlah bilangan ganjil adalah " + jumlahGanjil); 
    } 
}

/* OUTPUT
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99
Jumlah bilangan ganjil adalah 50
*/
