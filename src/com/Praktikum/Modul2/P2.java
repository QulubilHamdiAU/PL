package com.Praktikum.Modul2;

import java.util.Scanner;

public class P2 {

    static String nohp;
    static String[] pulsa = {"5000","10000","15000","20000","25000","50000"};
    static String pulsaInput;

    static void berhasil() {
        System.out.println("SELAMAT!!, TRANSAKSI ANDA BERHASIL!");
        System.exit(0);
    }

    static void cekpulsa() {
        boolean find = false;
        for (String p : pulsa) {
            if (pulsaInput.equals(p)) {
                break;
            }
            find = true;
        }
        if (find) {
            berhasil();
        }else{
            login();
        }
    }

    static void listpulsa() {
        System.out.println("==== Daftar Pulsa ==== ");
        for (int i=0; i<pulsa.length; i++) {
            System.out.println(i + 1 +"." + " " +pulsa[i]);
        }
    }

    static void cekNoHp() {
        for (int i=0; i<12; i++) {
            if (!nohp.matches("[0-9]*")) {
                System.out.println("Nomor Hp hanya terdiri dari angka, bukan huruf / symbol");
                login();
            } else if (nohp.length() < 12) {
                System.out.println("Nomor Hp yang dimasukkan kurang dari 12 digit");
                login();
            } else if (nohp.length() > 13) {
                System.out.println("Nomor Hp yang dimasukkan lebih dari 13 digit");
                login();
            } else if (!nohp.startsWith("08")) {
                System.out.println("Nomor Hp wajib Ada Angka 08 didepan!");
                login();
            }
        }
    }

    static void login() {

        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan Nomor HP : ");
        nohp = input.nextLine();
        cekNoHp();
        listpulsa();
        System.out.print("Pilih Pulsa : ");
        pulsaInput = input.nextLine();
        cekpulsa();
    }

    public static void main(String[] args) {
        login();
    }
}
