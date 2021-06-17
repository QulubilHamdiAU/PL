package com.Praktikum.Modul5;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {-80, -50, 0, 40, 0, -30, 90, 70, 89, 50, -55};
        int length;
        boolean x = false;
        for (int i=0;i < array.length; i++){
            for (int j=i+1;j < array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.print("data : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("\t");
        System.out.print("Index Search : ");
        length = input.nextInt();
        for (int i =0;i<array.length;i++){
            if (length == array[i]){
                x = true;
                System.out.println(length+" berada pada index ke "+i);
                break;
            }
        }
        if (x == false){
            System.out.println("\n Elemen index tidak ditemukan ");
        }
    }
}
