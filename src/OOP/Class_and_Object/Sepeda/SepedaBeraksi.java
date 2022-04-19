package OOP.Class_and_Object.Sepeda;

public class SepedaBeraksi {
    public static void main(String[] args) {
        // membuat object
        Sepeda sepeda1 = new Sepeda();

        // memanggil method dan memberikan nilai
        sepeda1.setGir(5); // set nilai gir = 5
        System.out.println("Gir saat ini : " + sepeda1.getGir());

        sepeda1.setGir(10); // set penambahan nilai gir = 10
        System.out.println("Gir saat ini : " + sepeda1.getGir());
    }
}
