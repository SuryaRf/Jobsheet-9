package Jobsheet9;

import java.util.Scanner;

public class LinearSearch27_2 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);

        int jmlInput;
        int[] arrayInt;
        int key;
        int hasil = 0;

        System.out.print("Masukan jumlah elemen array: ");
        jmlInput = sc27.nextInt();

        arrayInt = new int[jmlInput];

        for (int i = 0; i < jmlInput; i++) {
            System.out.print("Masukan nilai elemen ke- " + (i + 1) + ": ");
            arrayInt[i] = sc27.nextInt();
        }

        System.out.print("Masukan key yang ingin dicari: ");
        key = sc27.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke- " + hasil);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }

    }
}