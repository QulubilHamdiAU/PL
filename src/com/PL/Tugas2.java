package com.PL;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan angka tidak boleh lebih dari 10");
        try{
            System.out.println("Masukkan angka: ");
            angka = input.nextInt();
            if(angka > 10){
                throw new Exception("Angka yang anda masukkan lebih dari 10");
            } else {
                System.out.println("Angka sudah benar");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
