package com.Praktikum.Modul5;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};
        int cari;
        boolean x = false;

        Arrays.sort(array);
        System.out.printf("Array sesudah sorting : %s", Arrays.toString(array));

        System.out.print("\nIndex Search : ");
        cari = input.nextInt();
        for (int i =0;i<array.length;i++){
            if (cari == array[i]){
                x = true;
                System.out.println(cari +" berada pada index ke "+i);
                break;
            }
        }
        if (!x){
            System.out.println("\n Elemen index tidak ditemukan ");
        }
    }
}
