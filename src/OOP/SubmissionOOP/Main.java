package OOP.SubmissionOOP;

public class Main {
    public static void main(String[] args) {
        Nilai mahasiswa1 = new Nilai("Loid Forger");

        // memanggil method pada subclass satu per satu
        // mahasiswa1.masukkanJumlahTotalSKS();
        // mahasiswa1.masukkanNilai();
        // mahasiswa1.menghitungRataRataIPK();

        // atau panggil method getScore
        mahasiswa1.getScore();
    }
}
