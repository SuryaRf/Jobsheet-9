package Jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai27_1 {
    public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);

        int [] nilaiMhs = new int[10];
        double totalLulus =0;
        double totalTdkLulus = 0;
        double rata2, rata2_2;
        int lulus = 0;
        int tidaklulus = 0;
        int jmlInput;

        System.out.print("Masukan jumlah mahasiswa : ");
        jmlInput = sc27.nextInt();

        for (int i = 0; i < jmlInput; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + (i+1) + " : ");
            nilaiMhs[i] = sc27.nextInt();
        }

        for (int i = 0; i < jmlInput; i++) {
            if (nilaiMhs[i] > 70) {
                 totalLulus +=  nilaiMhs[i];
                 lulus++;
            }else{
                totalTdkLulus += nilaiMhs[i];
                tidaklulus++;
            }
        }
        rata2 = totalLulus/lulus;
        rata2_2 = totalTdkLulus/tidaklulus;
        System.out.println("Rata-rata nilai lulus = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2_2);




        
    }
    
}