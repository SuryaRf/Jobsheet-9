package Jobsheet9;

public class Individu227 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int[] array = new int[10];

        // Pengisian elemen array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // Mencetak elemen array secara terbalik
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
    

