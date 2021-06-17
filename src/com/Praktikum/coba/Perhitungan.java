package com.Praktikum.coba;

public class Perhitungan {

    int luas;
    int volume;

    int luas(balok sisi){
        return luas = 2* (sisi.getPanjang()* sisi.getLebar()+ sisi.getLebar()* sisi.getTinggi()+ sisi.getPanjang()* sisi.getTinggi());
    }

    int volume(balok sisi){
        return volume = sisi.getPanjang()* sisi.getLebar()* sisi.getTinggi();
    }

}
