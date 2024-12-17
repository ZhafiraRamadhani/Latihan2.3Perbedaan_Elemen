import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import java.util.*;

public class Perbedaan_Elemen {
    public static void main(String[] args) {
        // Tulis kode disini
        Scanner scanner = new Scanner(System.in);

        // Membaca input baris pertama
        System.out.println("Masukkan baris pertama angka (pisahkan dengan spasi):");
        String input1 = scanner.nextLine();
        String[] angka1 = input1.split(" ");

        // Membaca input baris kedua
        System.out.println("Masukkan baris kedua angka (pisahkan dengan spasi):");
        String input2 = scanner.nextLine();
        String[] angka2 = input2.split(" ");

        // Menggunakan Set untuk menyimpan angka dari kedua array
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Menambahkan angka dari baris pertama ke set1
        for (String angka : angka1) {
            set1.add(angka);
        }

        // Menambahkan angka dari baris kedua ke set2
        for (String angka : angka2) {
            set2.add(angka);
        }

        // Menghitung perbedaan
        List<String> hasil = new ArrayList<>();

        // Menambahkan angka yang ada di set1 tetapi tidak di set2
        for (String angka : set1) {
            if (!set2.contains(angka)) {
                hasil.add(angka);
            }
        }

        // Menambahkan angka yang ada di set2 tetapi tidak di set1
        for (String angka : set2) {
            if (!set1.contains(angka)) {
                hasil.add(angka);
            }
        }

        // Menampilkan hasil
        System.out.println("Angka-angka yang berbeda: " + String.join(" ", hasil));

        scanner.close();
    }
}