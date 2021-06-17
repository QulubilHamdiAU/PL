package com.Praktikum.Modul3;

class Perhitungan {
    int luas;
    int volume;

    int luas(balok sisi) {

        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();

        return luas = panjang * lebar * tinggi;
    }

    int volume(balok sisi) {
        int panjangV = sisi.getPanjang();
        int lebarV = sisi.getLebar();
        int tinggiV = sisi.getTinggi();

        return volume = panjangV * lebarV * tinggiV * 4;
    }
}
