package OOP.Polymorphism.Overloading;

public class MobilKonstruktor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Merah",2003);
        mobil1.info();

        Mobil mobil2 = new Mobil();
        mobil2.info();
    }
}
