package Jobsheet9;

import java.util.Scanner;

public class ArrHitungNilai27 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);

        int jmlInput;
        int[] arrayInt;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        int total = 0;

        System.out.print("Masukan jumlah elemen array: ");
        jmlInput = sc27.nextInt();

        arrayInt = new int[jmlInput];

        for (int i = 0; i < jmlInput; i++) {
            System.out.print("Masukan nilai elemen ke- " + (i + 1) + ": ");
            arrayInt[i] = sc27.nextInt();

            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }

            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }

            total += arrayInt[i];
        }

        double rata2 = total / jmlInput;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rata2);

    }
}