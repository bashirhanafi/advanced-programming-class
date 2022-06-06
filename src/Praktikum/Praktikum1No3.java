package Praktikum;

public class Praktikum1No3 {
    public static void main(String[] args) {
        System.out.print("x  |");
    
    for(int i = 1; i <= 3; i++) {
        System.out.print("   " + i);
    }
    
    System.out.println();
    System.out.println("-------------------");
    
    for(int i = 1; i <= 3; i++) {
        System.out.print(i + "  |");
        for(int j = 1; j <= 3; j++) {
            System.out.print("   " + i*j);
        }
        System.out.println();
        }
    }
}
