package com.Praktikum.Modul4;

import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hari;
        int tahun, sisa1, bulan, sisa2;

        System.out.print("Masukkan Jumlah Hari : ");
        hari = scan.nextInt();

        tahun = hari/365;
        sisa1 = hari%365;

        bulan = sisa1/30;
        sisa2 = sisa1%30;

        System.out.println(hari+" hari = "+tahun+" tahun, "+bulan+" bulan dan "+sisa2+" hari");
    }

}