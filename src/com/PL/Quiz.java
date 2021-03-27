package com.PL;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Angka1;
        double phi = 3.14;
        double Luas = 0;
        System.out.println("==== MENGHITUNG LUAS LINGKARAN ====");
        System.out.println("!!! NOTE !!!");
        System.out.println("Nilai input jari-jari tidak boleh 0");
        try{
            System.out.print("masukkan nilai jari-jari = ");
            Angka1 = input.nextInt();
            if ((Angka1 == 0)) {
                throw new Exception("Jari -jari tidak boleh bernilai 0!");
            }
            Luas = phi * Angka1 * Angka1;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nArithmeticException is handled. But take care of the variable \"Angka1\"");
        }
        finally {
            System.out.println("Sistem tetap berjalan");
            System.out.println("Keliling Lingkarannya adalah = " +Luas);
        }
    }
}
