package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai27_1 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc27.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke- " + i + " lulus! ");
            } else if (nilaiAkhir[i] <= 70) {
                System.out.println("Mahasiswa ke- " + i + " tidak lulus! ");
            }
            
        }

    }

}
