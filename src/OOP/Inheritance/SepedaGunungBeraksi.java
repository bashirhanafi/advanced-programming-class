package OOP.Inheritance;

public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        
        SepedaGunung sepedagunung1 = new SepedaGunung();

        sepedagunung1.setGir(10);
        System.out.println(sepedagunung1.getGir());

        sepedagunung1.setSadel(5);
        System.out.println(sepedagunung1.getSadel());
    }
}
