package com.Praktikum.coba;

import static com.Praktikum.coba.Driver.isCube;

public class Main {

    public static void main(String[] args) {
        balok x = new balok();

        x.setPanjang(4);
        x.setLebar(5);
        x.setTinggi(6);

        x.hasil();

        System.out.println(isCube(0));
    }
}
