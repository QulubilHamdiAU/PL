package com.Praktikum.Modul3;

class balok {
    private int tinggi;
    private int lebar;
    private int panjang;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil Luas Balok : " + ph.luas(this));
        System.out.println("Hasil Volume Balok : " + ph.volume(this));
    }
}
