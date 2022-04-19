package OOP.Encapsulation;

public class Sepeda {
    // access modifier PRIVATE pada instance variable
    private int gir;

    // setter
    void setGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
    }

    // getter
    int getGir() {
        return gir;
    }
}
