package Jobsheet9;

import java.util.Scanner;

class Individu327 {
    public static void main(String[] args) {

        // Deklarasi variabel
        String[] bulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
                "Oktober", "November", "Desember" };
        int nomorBulan;
        Scanner sc27 = new Scanner(System.in);

        // Inputan pengguna
        System.out.print("Masukkan nomor bulan (1-12): ");
        nomorBulan = sc27.nextInt();

        // Cetak nama bulan
        System.out.println("Nama bulan: " + bulan[nomorBulan - 1]);
    }

}