package OOP.Polymorphism.Overriding;

public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sepedagunung1 = new SepedaGunung();

        sepedagunung1.setGir(2);
        System.out.println(sepedagunung1.getGir());

        sepedagunung1.setGir(3);
        System.out.println(sepedagunung1.getGir());
    }
}
