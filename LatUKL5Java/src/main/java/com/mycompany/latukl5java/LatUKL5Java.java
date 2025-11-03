/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl5java;

/**
 *
 * @author ZHAFIR AKBAR ABQARY
 */

import java.util.Scanner;

public class LatUKL5Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0; // untuk menyimpan total nilai semua siswa

        // perulangan untuk input nilai tiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // hitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        // tampilkan hasil
        System.out.println("\n=== Rekapitulasi Nilai Siswa RPL ===");
        System.out.println("Jumlah siswa : " + jumlahSiswa);
        System.out.println("Total nilai  : " + totalNilai);
        System.out.println("Rata-rata    : " + rataRata);

        input.close();
    }
}
