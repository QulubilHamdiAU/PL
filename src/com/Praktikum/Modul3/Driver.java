package com.Praktikum.Modul3;

import java.util.Scanner;

public class Driver {
    static boolean isCube(long input){
        return (Math.round(Math.cbrt(input))) == input;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        balok nilai = new balok();

        System.out.print("Masukkan nilai panjang = ");
        int p = scan.nextInt();
        System.out.print("\nMasukkan nilai lebar = ");
        int l = scan.nextInt();
        System.out.print("\nMasukkan nilai tinggi = ");
        int t = scan.nextInt();

        nilai.setPanjang(p);
        nilai.setLebar(l);
        nilai.setTinggi(t);
        nilai.hasil();

        System.out.println("\nhasil Luas balok : " + isCube(0));
    }
}

