package OOP.SubmissionOOP;

import java.util.*;

class Mahasiswa {
    static String kodeMataKuliah, jawaban, nama, namaMataKuliah;
    static double SKS, poinSKS, bobotSKS, jumlahPoinSKS, jumlahSKS, rataRataIPK;
    static Scanner input = new Scanner(System.in);

    // Constructor
    Mahasiswa(String nama) {
        this.nama = nama;
    }

    // method pendukung
    void delayedText() {
        try {
		    Thread.sleep(10000);
	}
        catch (InterruptedException e) { 
			// do nothing 
	}
}
}
