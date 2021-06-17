package com.Praktikum.coba;

public class Driver {

    static boolean isCube(long input) {

        long a = Math.round(Math.cbrt(input));
        return a * a * a == input;
    }
}
