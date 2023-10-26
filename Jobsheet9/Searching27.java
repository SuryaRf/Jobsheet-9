package Jobsheet9;

import java.util.Scanner;

public class Searching27 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int[] gaji = new int[10];
        String[] nama = new String[10];
        int i, n;
        int cari;
        Scanner sc27 = new Scanner(System.in);

        // Pengisian elemen array
        System.out.println("Masukkan jumlah karyawan: ");
        n = sc27.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Masukkan nama karyawan ke-" + (i + 1) + ": ");
            nama[i] = sc27.next();
            System.out.print("Masukkan gaji karyawan ke-" + (i + 1) + ": ");
            gaji[i] = sc27.nextInt();
        }

        // Inputan data yang akan dicari
        System.out.print("Masukkan gaji yang akan dicari: ");
        cari = sc27.nextInt();

        // Searching
        boolean ditemukan = false;
        for (i = 0; i < n; i++) {
            if (gaji[i] == cari) {
                ditemukan = true;
                break;
            }
        }
if (ditemukan == true) {
    System.out.println("rawr");
} else {
    System.out.println("ga tru");
}
        // Cetak hasil searching
        if (ditemukan) {
            System.out.println("Gaji " + cari + " ditemukan pada indeks ke-" + i + ", yaitu karyawan " + nama[i]);
        } else {
            System.out.println("Gaji " + cari + " tidak ditemukan");
        }
    }

}
