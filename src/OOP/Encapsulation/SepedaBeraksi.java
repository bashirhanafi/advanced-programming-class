package OOP.Encapsulation;

public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda();

        sepeda1.setGir(10);

        // instance variable pada class Sepeda tidak bisa diubah lagi karena access modifiernya sudah dibuat private
        // sepeda1.gir = 3;
    }
}
