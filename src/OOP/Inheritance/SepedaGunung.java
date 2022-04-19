package OOP.Inheritance;

public class SepedaGunung extends Sepeda {
    private int sadel;

    void setSadel(int jumlah) {
        sadel = getGir() - jumlah;
    }

    int getSadel() {
        return sadel;
    }
}
