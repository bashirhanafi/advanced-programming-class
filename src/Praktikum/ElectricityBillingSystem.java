package Praktikum;

import java.util.*;
public class ElectricityBillingSystem {
    static Scanner input = new Scanner(System.in);
    static int pilihMenu;
    static int tarif;
    static String gtl = "";
    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        println("\n\t\t\tELECTRIC BILLING SYSTEM - MyPLN\t\t\t");
        println("");
        println("Menu :   \n1. Pelanggan untuk rumah tangga\n2. Pelanggan untuk bisnis\n3. Exit");
        print("Pilih menu : "); pilihMenu = input.nextInt();
        println("");
        flush();
        
        if(pilihMenu==1) {
            cekPelangganRumahTangga();
        } else if(pilihMenu==2) {
            cekPelangganBisnis();
        } else if(pilihMenu==3) {
            System.exit(0);
        } else {
            println("Menu yang Anda masukkan salah!");
            menu();
        }
    }

    static void cekPelangganRumahTangga() {
        println("Menu : \n1. Cek tarif listrik per KWH tahun 2022\n2. Input pembayaran listrik");
        print("Pilih menu : "); pilihMenu = input.nextInt();
        println("");
        flush();

        if(pilihMenu==1) {
            flush();
            println("TARIF LISTRIK PER KWH TAHUN 2022 - Rumah Tangga\n");

            // Ukuran Array [9][3]
            String[][] tarifListrikRumahTangga = {{"Golongan Tarif Listrik","Batas Daya","Biaya Pemakaian"},
                                                 {"=======================================================","",""},
                                                 {"R-1/TR","\t\t0-450 VA","Rp169/kWh"},
                                                 {"R-1M/TR","\t\t451-900 VA","Rp1.345/kWh"},
                                                 {"R-1/TR","\t\t901-1300 VA","Rp1.352/kWh"},
                                                 {"R-1/TR","\t\t1301-2200 VA","Rp1.444/kWh"},
                                                 {"R-2/TR","\t\t2201-5500 VA","Rp1.444/kWh"},
                                                 {"R-3/TR","\t\t> 5501 VA","Rp1.444/kWh"}};

            for(int i = 0; i < tarifListrikRumahTangga.length; i++) {
                for(int j = 0; j < tarifListrikRumahTangga[i].length; j++) {
                    print(tarifListrikRumahTangga[i][j] + "\t");
                } println("");
            }
        } else if(pilihMenu==2) {
            int jumlahPelanggan = 1;
            int [][] pembayaran = new int[jumlahPelanggan][3];
            int[] va = new int[jumlahPelanggan];
            String [] bulan = new String[jumlahPelanggan];

            println("INPUT PEMBAYARAN LISTRIK - MyPLN\n");

            for(int i = 0; i < jumlahPelanggan; i++) {
                print("Bulan : "); bulan[i] = input.next(); input.nextLine();
                print("ID : "); pembayaran[i][0] = input.nextInt();
                print("Volt Ampere : "); va[i] = input.nextInt();
                print("Meter Awal : "); pembayaran[i][1] = input.nextInt();
                print("Meter Akhir : "); pembayaran[i][2] = input.nextInt();
                println("");
                flush();
            }
            
            for(int i = 0; i < pembayaran.length; i++) {
                println("Bulan\t\t\tID\t\t\tMeter Awal\tMeter Akhir\t\tJumlah Meter\t\tGTL\t\t\tTarif/kWh\t\tJumlah Bayar");
                println("=================================================================================================================================================================");
                print(bulan[i] + "\t\t");
                for(int j = 0; j < pembayaran[i].length; j++) {
                    print(pembayaran[i][j]+"\t\t");
                }

                int jumlahMeter = pembayaran[i][2] - pembayaran[i][1];

                if(va[i] >= 0 && va[i] <= 450) {
                    gtl = "R-1/TR 450 VA";
                    tarif = 169;
                } else if(va[i] >= 450 && va[i] <= 900) {
                    gtl = "R-1M/TR 900 VA";
                    tarif = 1345;
                } else if(va[i] >= 901 && va[i] <= 1300) {
                    gtl = "R-1/TR 1300 VA";
                    tarif = 1352;
                } else if(va[i] >= 1301 && va[i] <= 2200) {
                    gtl = "R-1/TR 2200 VA";
                    tarif = 1444;
                } else if(va[i] >= 2201 && va[i] <= 5500) {
                    gtl = "R-2/TR 5500 VA";
                    tarif = 1444;
                } else if(va[i] > 5501) {
                    gtl = "R-3/TR > 5501 VA";
                    tarif = 1444;
                }

                int jumlahBayar = tarif*jumlahMeter;

                print("\t"+jumlahMeter+"\t\t\t"+gtl+"\t\t"+tarif+"\t\t"+jumlahBayar);
                println("");

                print("Apakah anda ingin membayar? (y/n) : "); String question = input.next();
                if(question.equalsIgnoreCase("y")) {
                    print("Masukkan ID Anda : "); int id = input.nextInt();
                    if(id==pembayaran[i][0]) {
                        println("Success!");
                    } else {
                        println("ID yang Anda masukkan salah. Silakan coba lagi");
                        menu();
                    }
                }
            }
        } else {
            println("Menu yang Anda inputkan salah!");
        }
    }

    static void cekPelangganBisnis() {
        println("Menu : \n1. Cek tarif listrik per KWH tahun 2022\n2. Input pembayaran listrik");
        print("Pilih menu : "); pilihMenu = input.nextInt();
        flush();
        
        if(pilihMenu==1) {
            flush();
            println("TARIF LISTRIK PER KWH TAHUN 2022 - Bisnis\n");

            // Ukuran array [8][3]
            String[][] tarifListrikBisnis = {{"Golongan Tarif Listrik","Batas Daya","Biaya Pemakaian"},
                                            {"=======================================================","",""},
                                            {"B-1/TR","\t\t0-450 VA","Rp254/kWh"},
                                            {"B-1/TR","\t\t451-900 VA","Rp420/kWh"},
                                            {"B-1/TR","\t\t901-1300 VA","Rp966/kWh"},
                                            {"B-1/TR","\t\t1301-5500 VA","Rp1.100/kWh"},
                                            {"B-2/TR","\t\t5501-200 kVA","Rp1.515/kWh"},
                                            {"B-3/TM","\t\t> 200 kVA","Rp1.114/kWh"}};

                for(int i = 0; i < tarifListrikBisnis.length; i++) {
                    for(int j = 0; j < tarifListrikBisnis[i].length; j++) {
                        print(tarifListrikBisnis[i][j] + "\t");
                    }
                    println("");
                }

        } else if(pilihMenu==2) {
            flush();
            int jumlahPelanggan = 1;
            
            int [][] pembayaran = new int[jumlahPelanggan][3];
            int[] va = new int[jumlahPelanggan];
            String [] bulan = new String[jumlahPelanggan];

            println("INPUT PEMBAYARAN LISTRIK - MyPLN\n");

            for(int i = 0; i < jumlahPelanggan; i++) {
                print("Bulan : "); bulan[i] = input.next(); input.nextLine();
                print("ID : "); pembayaran[i][0] = input.nextInt();
                print("Volt Ampere : "); va[i] = input.nextInt();
                print("Meter Awal : "); pembayaran[i][1] = input.nextInt();
                print("Meter Akhir : "); pembayaran[i][2] = input.nextInt();
                println("");
                flush();
            }
            
            for(int i = 0; i < pembayaran.length; i++) {
                println("Bulan\t\t\tID\t\t\tMeter Awal\tMeter Akhir\t\tJumlah Meter\t\tGTL\t\t\tTarif/kWh\t\tJumlah Bayar");
                println("=================================================================================================================================================================");
                print(bulan[i] + "\t\t");
                for(int j = 0; j < pembayaran[i].length; j++) {
                    print(pembayaran[i][j]+"\t\t");
                }

                int jumlahMeter = pembayaran[i][2] - pembayaran[i][1];

                if(va[i] >= 0 && va[i] <= 450) {
                    gtl = "B-1/TR 450 VA";
                    tarif = 254;
                } else if(va[i] >= 450 && va[i] <= 900) {
                    gtl = "B-1/TR 900 VA";
                    tarif = 420;
                } else if(va[i] >= 901 && va[i] <= 1300) {
                    gtl = "B-1/TR 1300 VA";
                    tarif = 966;
                } else if(va[i] >= 1301 && va[i] <= 5500) {
                    gtl = "B-1/TR 5500 VA";
                    tarif = 1100;
                } else if(va[i] >= 5501 && va[i] <= 200000) {
                    gtl = "B-2/TR 200 kVA";
                    tarif = 1515;
                } else if(va[i] > 200000) {
                    gtl = "B-3/TR > 200 kVA";
                    tarif = 1114;
                }

                int jumlahBayar = tarif*jumlahMeter;

                print("\t"+jumlahMeter+"\t\t\t"+gtl+"\t\t"+tarif+"\t\t"+jumlahBayar);
                println("");

                print("Apakah anda ingin membayar? (y/n) : "); String question = input.next();
                if(question.equalsIgnoreCase("y")) {
                    print("Masukkan ID Anda : "); int id = input.nextInt();
                    if(id==pembayaran[i][0]) {
                        println("Success!");
                    } else {
                        println("ID yang Anda masukkan salah. Silakan coba lagi");
                        menu();
                    }
                } else {
                    flush();
                    menu();
                }
            }
        } else {
            println("Menu yang Anda inputkan salah!");
        }
    }

    @methodsupport
    static Object print(Object messages) {
        System.out.print(messages);
        return messages;
    }
    static Object println(Object messages) {
        System.out.println(messages);
        return messages;
    }
    static void flush() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
