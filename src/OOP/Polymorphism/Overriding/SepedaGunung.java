package OOP.Polymorphism.Overriding;

public class SepedaGunung extends Sepeda {
    void setGir(int pertambahanGir) {
        super.setGir(pertambahanGir);
        gir = 2*getGir();
    }
}
