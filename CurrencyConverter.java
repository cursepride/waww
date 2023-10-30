/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktik3;

/**
 *
 * @author xwely
 */
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Menentukan tingkat konversi (misalnya, dari USD ke EUR)
        try (Scanner input = new Scanner(System.in)) {
            // Menentukan tingkat konversi (misalnya, dari USD ke EUR)
            System.out.print("Masukkan tingkat konversi (1 USD ke IDR mata uang tujuan): ");
            double exchangeRate = input.nextDouble();
            
            // Meminta pengguna untuk memasukkan jumlah dalam mata uang asal
            System.out.print("Masukkan jumlah dalam mata uang asal: ");
            double amountInUSD = input.nextDouble();
            
            // Menghitung jumlah dalam mata uang tujuan
            double amountInDestinationCurrency = amountInUSD * exchangeRate;
            
            // Menampilkan hasil konversi
            System.out.println("Jumlah dalam mata uang tujuan: " + amountInDestinationCurrency);
            System.out.println("ramboooooo");
            System.out.println("pisau");
            System.out.println("anjay");
        }
    }
}
