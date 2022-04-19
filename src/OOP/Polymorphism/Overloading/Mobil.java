package OOP.Polymorphism.Overloading;

class Mobil {
    String warna;
    int tahunProduksi;
    
    // method/constructor memiliki nama sama dengan parameter yang berbeda
    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public Mobil() {

    }

    void info() {
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahunProduksi);
    }
}
