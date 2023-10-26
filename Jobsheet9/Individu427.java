package Jobsheet9;

import java.util.Scanner;

public class Individu427 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int[] array = new int[8];
        int total = 0;
        double rataRata;
        Scanner sc27 = new Scanner(System.in);

        // Pengisian elemen array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            array[i] = sc27.nextInt();
            total += array[i];
        }

        // Hitung rata-rata
        rataRata = total / array.length;

        // Cetak rata-rata
        System.out.println("Rata-rata: " + rataRata);
    }

}