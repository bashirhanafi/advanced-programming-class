package OOP.Class_and_Object.Mobil;

public class MobilBeraksi {
    public static void main(String[] args) {
        // Membuat object
        Mobil mobil1 = new Mobil();
        // memanggil atribut dan memberi nilai
        mobil1.warna = "Hitam";
        mobil1.tahunProduksi = 2006;
        System.out.println("Warna : " + mobil1.warna);
        System.out.println("Tahun : " + mobil1.tahunProduksi);
    }
}
