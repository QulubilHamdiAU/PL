package com.Praktikum.Modul5;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka;
        int size;
        double positif = 0, negatif = 0, nol = 0;

        System.out.print("Size : ");
        size = input.nextInt();
        angka = new int[size];

        System.out.print("Data Input : ");
        for (int i = 0; i < angka.length; i++){
            angka [i] = input.nextInt();

        }
        System.out.print("Hasil : ");
        Arrays.sort(angka);
        for (int i = 0; i < angka.length; i++){
            if (angka[i]<0){

                negatif++;
            }else if (angka[i]>0){

                positif++;
            }else{

                nol++;
            }
            System.out.print(angka[i]+" ");
        }

        System.out.printf("\nPositif: %.6f",positif/angka.length);
        System.out.printf("\nNegatif: %.6f",negatif/angka.length);
        System.out.printf("\nZero   : %.6f",nol/angka.length);
    }
}
