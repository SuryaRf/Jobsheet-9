package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc27.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }

    }

}
